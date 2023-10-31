class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        int N=nums.length;
        for(int i=0;i<N;i++){
            if(ans[0]==-1 && nums[i]==target) ans[0]=i;
            if(ans[1]==-1 && nums[N-i-1]==target) ans[1]=N-i-1;
        }
        return ans;
    }
}