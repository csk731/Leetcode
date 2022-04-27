class Solution {
    public int majorityElement(int[] nums) {
        int me=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(count!=0){
                if(me!=nums[i]) count--;
                else count++;
            }
            else {
                me=nums[i];
                count++;
            }
        }
        return me;
    }
}