class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i:nums){
            if(!hs.add(i)) return true;
        }
        return false;
    }
}