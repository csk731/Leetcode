class Solution {
    public int findDuplicate(int[] nums) {
        int N=nums.length;
        for(int i=0;i<N;i++){
            while(nums[i]!=(i+1) && nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
        }
        //for(int n:nums){System.out.println(n);}
        return nums[N-1];       
        
    }
}