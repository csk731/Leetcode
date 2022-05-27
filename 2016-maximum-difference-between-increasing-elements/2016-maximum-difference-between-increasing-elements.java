class Solution {
    public int maximumDifference(int[] A) {
        int N=A.length,ans=0,min=A[0];
        for(int i=1;i<N;i++){
            if(A[i]<min) min=A[i];
            ans=Math.max(ans,A[i]-min);
        }
        return (ans>0)?ans:-1;
    }
}