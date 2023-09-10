class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr2=n-1;
        int ptr1=m-1;
        int placer=m+n-1;
        while(ptr2>=0 && ptr1>=0){
            if(nums2[ptr2]>=nums1[ptr1]) nums1[placer--]=nums2[ptr2--];
            else nums1[placer--]=nums1[ptr1--];
        }
        while(ptr1>=0){
            nums1[placer--]=nums1[ptr1--];
        }
        while(ptr2>=0){
            nums1[placer--]=nums2[ptr2--];
        }
    }
}