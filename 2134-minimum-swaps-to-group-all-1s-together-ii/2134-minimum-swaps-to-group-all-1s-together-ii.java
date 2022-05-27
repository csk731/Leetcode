class Solution {
    public int minSwaps(int[] A) {
        int N=A.length,count=0;
        int temp=0,min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]==1) count++;
        }
        for(int i=N-count;i<N;i++){
            if(A[i]==1) temp++;
        }
        for(int i=0;i<N;i++){
            if(A[i]==1) temp++;
            if((i<count && A[N+i-count]==1) || (i>=count && A[i-count]==1)) temp--;
            if((count-temp)<min) min=count-temp;
        }
        return min;
    }
}