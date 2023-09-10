class Solution {
    public void sortColors(int[] nums) {
        // Stable Algorithm
        int N=nums.length;
        int pointer=0;
        for(int i=0;i<N;i++){
            if(nums[i]==0){
                nums[i]=nums[pointer];
                nums[pointer++]=0;
            }
        }
        pointer=N-1;
        for(int i=N-1;i>=0;i--){
            if(nums[i]==2){
                nums[i]=nums[pointer];
                nums[pointer--]=2;
            }
        }
    }
}