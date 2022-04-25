class Solution {
    public int pivotIndex(int[] nums) {
        int N=nums.length;
        int ls=0,rs=0;
        for(int i=0;i<N;i++){
            rs+=nums[i];
        }
        for(int i=0;i<N;i++){
            rs-=nums[i];
            if(ls==rs) return i;
            ls+=nums[i];
        }
        return -1;
    }
}