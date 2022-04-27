class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Sliding Window
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(i>k) hs.remove(nums[i-k-1]);
            if(!hs.add(nums[i])) return true;
        }
        return false;
    }
}