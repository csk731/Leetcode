class Solution {
    public int findUnsortedSubarray(int[] A) {
        int N=A.length;
        int leftMax=Integer.MIN_VALUE, rightMin=Integer.MAX_VALUE;
        int rightBound=-1, leftBound=0;
        for(int i=0;i<N;i++){
            if(leftMax>A[i]) rightBound=i;
            leftMax=Math.max(leftMax,A[i]);

            if(A[N-1-i]>rightMin) leftBound=N-1-i;
            rightMin=Math.min(rightMin,A[N-i-1]);
        }
        return rightBound-leftBound+1;
    }
}