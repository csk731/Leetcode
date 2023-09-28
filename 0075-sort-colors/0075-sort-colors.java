class Solution {
    public void sortColors(int[] nums) {
        int k=0, N=nums.length, m=N-1;
        for(int i=0;i<N;i++){
            if(nums[i]==0){
                if(nums[k]!=nums[i]){
                    nums[i]=nums[k];
                    nums[k++]=0;
                }
                else k++;
            }
        }
        for(int i=N-1;i>=k;i--){
            if(nums[i]==2){
                if(nums[m]!=nums[i]){
                    nums[i]=nums[m];
                    nums[m--]=2;
                }
                else m--;
            }
        }
    }
}