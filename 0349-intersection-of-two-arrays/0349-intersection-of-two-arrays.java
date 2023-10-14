class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int n1:nums1){
            hs.add(n1);
        }
        for(int n2:nums2){
            if(hs.contains(n2)){
                list.add(n2);
                hs.remove(n2);
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