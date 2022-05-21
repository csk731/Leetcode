class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0,N=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            if(hm.containsKey(nums[i])) {
                count+=hm.get(nums[i]);
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else hm.put(nums[i],1);
        }
        return count;
    }
}