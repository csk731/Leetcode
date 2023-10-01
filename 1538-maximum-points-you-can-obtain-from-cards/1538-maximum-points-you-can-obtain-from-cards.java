class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int N=cardPoints.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int max=sum;
        for(int i=k-1;i>=0;i--){
            sum+=cardPoints[i+N-k];
            sum-=cardPoints[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}