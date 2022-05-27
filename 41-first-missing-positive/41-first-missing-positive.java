class Solution {
    public int firstMissingPositive(int[] A) {
        int N=A.length;
        for(int i=0;i<N;i++){
            while(A[i]!=(i+1)){
                if(A[i]<1 || A[i]>N || A[i]==A[A[i]-1]) break;
                int temp=A[i];
                A[i]=A[temp-1];
                A[temp-1]=temp;
            }
        }
        for(int i=0;i<N;i++){
            if(A[i]!=(i+1)) return i+1;
        }
        return N+1;
    }
}