class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0,N=nums.length;
        while(j<N){
            if(nums[j]!=0) nums[i++]=nums[j];
            j++;
        }
        while(i<N)
            nums[i++]=0;
    }
}