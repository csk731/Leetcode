class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0, N=nums.length;
        for(int i=0;i<N;i++){
            if(i==0 || nums[i]!=nums[i-1]) nums[k++]=nums[i];
        }
        return k;
    }
}