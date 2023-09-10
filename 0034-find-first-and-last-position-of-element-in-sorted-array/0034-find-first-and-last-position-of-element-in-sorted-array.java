class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        int N=nums.length;
        for(int i=0;i<N;i++){
            if(nums[i]==target){
                if(ans[0]==-1) ans[0]=i;
                ans[1]=i;
            }
        }
        return ans;
    }
}