class Solution {
    public void sortColors(int[] nums) {
        // Stable Algorithm
        int N=nums.length;
        int i=0,ptr1=0,ptr2=N-1;
        while(i<=ptr2){
            if(nums[i]==0){
                nums[i]=nums[ptr1];
                nums[ptr1]=0;
                if(i==ptr1) i++;
                ptr1++;
            }
            else if(nums[i]==2){
                nums[i]=nums[ptr2];
                nums[ptr2]=2;
                ptr2--;
            }
            else i++;
        }
    }
}