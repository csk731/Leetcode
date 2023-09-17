class Solution {
    public int subarraySum(int[] nums, int k) {
        int N=nums.length;
        int ans=0;
        for(int i=0;i<N;i++){
            int carry=0;
            for(int j=i;j<N;j++){
                carry+=nums[j];
                if(carry==k) ans++;
            }
        }
        return ans;
    }
}