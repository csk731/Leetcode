class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        int n1=nums1.length, n2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p=0,q=0;
        while(p<n1 && q<n2){
            if(nums1[p]<nums2[q]) p++;
            else if(nums1[p]>nums2[q]) q++;
            else{
                list.add(nums1[p]);
                p++;
                q++;
            }
        }
        int i=0;
        int ans[]=new int[list.size()];
        for(int x:list){
            ans[i++]=x;
        }
        return ans;
    }
}