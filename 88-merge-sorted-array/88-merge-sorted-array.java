class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            int j=0;
            for(j=m+i;j>0;j--){
                if(nums2[i]>=nums1[j-1]) break;
                nums1[j]=nums1[j-1];
            }
            nums1[j]=nums2[i];
        }
    }
}