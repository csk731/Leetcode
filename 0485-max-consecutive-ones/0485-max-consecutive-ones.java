class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0, count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) count++;
            if(count>ans) ans=count;
            if(nums[i]==0) count=0;
        }
        return ans;
    }
}