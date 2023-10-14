class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int n1:nums1){
            if(!hm.containsKey(n1)) hm.put(n1,1);
            else hm.put(n1,hm.get(n1)+1);
        }
        for(int n2:nums2){
            if(hm.containsKey(n2)){
                list.add(n2);
                hm.put(n2,hm.get(n2)-1);
                if(hm.get(n2)==0) hm.remove(n2);
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