class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int N=nums.length;
        int s=0, e=0, ans=0;
        while(e<N){
            int diff=nums[e]-nums[s];
            if(s==e || diff<k) e++;
            else if(diff==k){
                ans++;
                while(e<N-1 && nums[e]==nums[++e]);
                while(s<N-1 && nums[s]==nums[++s]);
            }
            else s++;
        }
        return ans;
    }
}