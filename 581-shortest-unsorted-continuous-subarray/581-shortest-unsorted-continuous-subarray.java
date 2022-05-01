class Solution {
    public int findUnsortedSubarray(int[] A) {
        int a=0,b=-1,N=A.length;;
        int max=A[0];
        int min=A[N-1];
        for(int i=N-1;i>=0;i--){
            min=Math.min(min,A[i]);
            if(A[i]>min) a=i;
            max=Math.max(max,A[N-i-1]);
            if(A[N-i-1]<max) b=N-i-1;
        }
        return b-a+1;
    }
}