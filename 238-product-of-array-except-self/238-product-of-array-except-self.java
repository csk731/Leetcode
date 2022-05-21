class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N=nums.length;
        int leftpro=nums[0],rightpro=nums[N-1];
        int res[]=new int[N];
        for(int i=0;i<N;i++){
            res[i]=1;
        }
        for(int i=1;i<N;++i){
            res[i]*=leftpro;
            res[N-i-1]*=rightpro;
            leftpro*=nums[i];
            rightpro*=nums[N-i-1];
        }
        return res;
    }
}