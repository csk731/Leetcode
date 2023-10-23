class Solution {
    public void downHeapify(int i, int nums[], int ptr){
        int N=nums.length;
        int lc=(2*i)+1, rc=(2*i)+2;
        if(lc>ptr) return;
        int max=i;
        if(nums[lc]>nums[max]) max=lc;
        if(rc<=ptr && nums[rc]>nums[max]) max=rc;
        if(max!=i){
            int temp=nums[max];
            nums[max]=nums[i];
            nums[i]=temp;
            downHeapify(max,nums,ptr);
        }
    }
    public void buildHeap(int nums[]){
        int N=nums.length;
        for(int i=N-1;i>=0;i--){
            downHeapify(i,nums,N-1);
        }
    }
    public int findKthLargest(int[] nums, int k) {
        buildHeap(nums);
        int ans=-1;
        int ptr=nums.length-1;
        while(k!=0){
            ans=nums[0];
            nums[0]=nums[ptr--];
            downHeapify(0,nums,ptr);
            k--;
        }
        return ans;
    }
}