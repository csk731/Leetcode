class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0) return k;
        int product=1, ans=0;
        int s=0, e=0, N=nums.length;
        while(e<N){
            if(product*nums[e]<k){
                product*=nums[e];
                ans+=(e-s+1);
                e++;
            }
            else if(s==e){
                product=1;
                s++;
                e++;
            }
            else{
                product/=nums[s];
                s++;
            }
        }
        return ans;
    }
}