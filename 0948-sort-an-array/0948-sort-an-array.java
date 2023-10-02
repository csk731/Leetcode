class Solution {
    public void sort(int[] nums, int i, int j){
        if(i==j) return;
        int mid=(i+j)/2;
        sort(nums,i,mid);
        sort(nums,mid+1,j);
        merge(nums, i, mid, j);
    }
    public void merge(int nums[], int i, int mid, int j){
        int m=mid-i+1, n=j-mid;
        int arr1[]=new int[m];
        int arr2[]=new int[n];

        for(int x=0;x<m;x++)
            arr1[x]=nums[i+x];

        for(int y=0;y<n;y++)
            arr2[y]=nums[mid+1+y];

        int s=0, e=0, p=i;
        while(s<m && e<n){
            if(arr1[s]<arr2[e]) nums[p++]=arr1[s++];
            else nums[p++]=arr2[e++];
        }
        while(s<m){
            nums[p++]=arr1[s++];
        }
        while(e<n){
            nums[p++]=arr2[e++];
        }
    }
    public int[] sortArray(int[] nums) {
        int N=nums.length;
        sort(nums,0,N-1);
        return nums;
    }
}