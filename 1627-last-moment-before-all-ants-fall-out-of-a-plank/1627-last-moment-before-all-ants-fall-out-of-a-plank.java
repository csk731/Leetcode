class Solution {
    public int getLastMoment(int n, int[] left, int[] right){
        int min=n+1, max=-1;
        int M=left.length, N=right.length;
        for(int i=0;i<M;i++){
            max=Math.max(max,left[i]);
        }
        for(int i=0;i<N;i++){
            min=Math.min(min,right[i]);
        }
        return Math.max(n-min,max);
    }
}