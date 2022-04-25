class Solution {
    public int minStartValue(int[] nums) {
        int min=nums[0],carry=0;
        for(int i=0;i<nums.length;i++){
            carry+=nums[i];
            min=Math.min(min,carry);
        }
        min*=(-1);
        return (min>=0)?min+1:1;
    }
}