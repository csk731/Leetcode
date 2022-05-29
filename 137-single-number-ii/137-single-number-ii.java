class Solution {
    public int singleNumber(int[] A) {
        int i=0,ans=0,N=A.length;
        while(i<32){
            int count=0;
            for(int j=0;j<N;j++){
                if(((A[j]>>i)&1)==1) count++;
            }
            if((count%3)!=0) ans+=(1<<i);
            i++;
        }
        return ans;
    }
}