class Solution {
    public int[] buildArray(int[] nums) {
        int N=nums.length;
        for(int i=0;i<N;i++){
            nums[i]=nums[i]+((nums[nums[i]])%N)*N;
        }
        for(int i=0;i<N;i++){
            nums[i]/=N;
        }
        return nums;
    }
}