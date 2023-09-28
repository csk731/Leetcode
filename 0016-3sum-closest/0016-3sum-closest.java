class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int N=nums.length;
        int min=Integer.MAX_VALUE, ans=0;
        for(int i=0;i<N;i++){
            int s=i+1, e=N-1;
            int newTarget=target-nums[i];
            while(s<e){
                int sum=nums[s]+nums[e];
                if(Math.abs(sum-newTarget)<min){
                    min=Math.abs(sum-newTarget);
                    ans=nums[i]+nums[s]+nums[e];
                }
                if(sum<newTarget) s++;
                else e--;
            }
        }
        return ans;
    }
}