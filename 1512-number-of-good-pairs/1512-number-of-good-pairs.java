class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0,N=nums.length;
        int res[]=new int[101];
        for(int i=0;i<N;i++){
            count+=(res[nums[i]]++);
        }
        return count;
    }
}