class Solution {
    public int gcd(int x, int y){
        if(x==0) return y;
        return gcd(y%x,x);
    }
    public int maxPoints(int[][] A) {
        int N=A.length, max=1;
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int y=A[j][1]-A[i][1], x=A[j][0]-A[i][0];
                int hcf=gcd(y,x);
                y/=hcf;
                x/=hcf;
                if(x<0 && y<0 || y<0){
                    x*=-1;
                    y*=-1;
                }
                String str=y+","+x;
                if(hm.containsKey(str)) hm.put(str, hm.get(str)+1);
                else hm.put(str, 1);
                max=Math.max(hm.get(str)+1,max);
            }
            hm.clear();
        }
        return max;
    }
}