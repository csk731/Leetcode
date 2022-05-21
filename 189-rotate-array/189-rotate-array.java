class Solution {
    public void rotate(int[] nums, int k) {
        int N=nums.length;
        k=k%N;
        solve(nums,0,N-1);
        solve(nums,0,k-1);
        solve(nums,k,N-1);
    }
    public void solve(int nums[],int s,int e){
        while(s<e){
            nums[s]=nums[s]+nums[e];
            nums[e]=nums[s]-nums[e];
            nums[s]=nums[s]-nums[e];
            s++;e--;
        }
    }
}