class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int N=nums.length;
        for(int x:nums){
            hs.add(x);
        }
        int max=0;
        for(int i=0;i<N;i++){
            if(!hs.contains(nums[i]+1)){
                int count=0;
                int left=nums[i];
                while(hs.remove(left--)){
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}