class Solution {
    public int[] buildArray(int[] nums) {
        int N=nums.length;
        for(int i=0;i<N;i++){
            nums[i]=(N*nums[i])+((nums[i]<i)?((nums[nums[i]])/N):((nums[nums[i]])));
        }
        for(int i=0;i<N;i++){
            nums[i]%=N;
        }
        return nums;
    }
}