class Solution {
    public double findMaxAverage(int[] A, int B) {
        int N=A.length;
        double sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(i==B-1) max=sum/B;
            else if(i>=B) {
                sum-=A[i-B];
                if((sum/B)>max) max=(sum/B);
            }
        }
        return max;
    }
}