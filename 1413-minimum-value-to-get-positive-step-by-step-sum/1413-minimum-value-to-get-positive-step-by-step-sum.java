class Solution {
    public int minStartValue(int[] nums) {
        int min=0,carry=0;
        for(int i=0;i<nums.length;i++){
            carry+=nums[i];
            min=Math.min(min,carry);
        }
        return 1-min;
    }
}