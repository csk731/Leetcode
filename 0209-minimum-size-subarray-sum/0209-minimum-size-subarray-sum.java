class Solution {
    public int minSubArrayLen(int B, int[] A) {
        int N=A.length, s=0, e=0;
        int ans=Integer.MAX_VALUE, sum=0;
        while(e<N){
            if(sum+A[e]<B){
                sum+=A[e++];
            }
            else{
                ans=Math.min(ans,e-s+1);
                if(s!=e) sum-=A[s++];
                else {
                    s++;
                    e++;
                }
            }
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}