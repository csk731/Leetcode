class Solution {
    public int[] runningSum(int[] nums) {
        int N=nums.length;
        for(int i=1;i<N;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}