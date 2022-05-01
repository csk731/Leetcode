class Solution {
    public int findUnsortedSubarray(int[] A) {
        int a=0,b=-1,N=A.length;
        int max=A[0], min=A[N-1];
        for(int i=N-1;i>=0;i--){
            if(A[i]<min) min=A[i];
            if(A[N-i-1]>max) max=A[N-i-1];
            if(A[i]>min) a=i;
            if(A[N-i-1]<max) b=N-i-1;
        }
        return b-a+1;
    }
}