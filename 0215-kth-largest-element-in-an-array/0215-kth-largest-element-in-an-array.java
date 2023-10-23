class Solution {
    public void downHeapify(int i, int nums[], int ptr){
        int N=nums.length;
        int lc=(2*i)+1, rc=(2*i)+2;
        if(lc>ptr) return;
        int min=i;
        if(lc<=ptr && nums[lc]<nums[min]) min=lc;
        if(rc<=ptr && nums[rc]<nums[min]) min=rc;
        if(min!=i){
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
            downHeapify(min,nums,ptr);
        }
    }
    public int findKthLargest(int[] nums, int k) {
        for(int i=k-1;i>=0;i--)
            downHeapify(i,nums,k-1);
        int ans=nums[0];
        int N=nums.length;
        int ptr=k;
        while(ptr<N){
            if(nums[ptr]>ans){
                nums[0]=nums[ptr];
                downHeapify(0,nums,k-1);
                ans=nums[0];
            }
            ptr++;
        }
        return ans;
    }
}