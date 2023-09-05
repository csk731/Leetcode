class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int resultSum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r) {
            int currSum = nums[i] + nums[l] + nums[r];
            int currDiff = currSum - target;
            if(currDiff < 0 ) l++;
            else if(currDiff > 0 ) r--;
            else return target;
            currDiff = Math.abs(currDiff);
            if(currDiff < minDiff) {
                minDiff = currDiff;
                resultSum = currSum;
            }
            }
        }
        return resultSum;
    }
}