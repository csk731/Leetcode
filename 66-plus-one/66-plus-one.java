class Solution {
    public int[] plusOne(int[] A) {
        int carry=1,N=A.length;
        for(int i=N-1;i>=0;i--){
            if(A[i]<9){
                A[i]++;
                return A;
            }
            A[i]=0;
        }
        int res[]=new int[N+1];
        res[0]=1;
        return res;
        
    }
}