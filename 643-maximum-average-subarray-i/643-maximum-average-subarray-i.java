class Solution {
    public double findMaxAverage(int[] A, int B) {
        int N=A.length;
        long sum=0,max=-1;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(i==B-1) max=sum;
            else if(i>=B) {
                sum-=A[i-B];
                if(sum>max) max=sum;
            }
        }
        return max/(B*1.0);
    }
}