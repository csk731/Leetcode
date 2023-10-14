class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int N=nums.length;
        for(int x:nums){
            hs.add(x);
        }
        int max=0;
        for(int i=0;i<N;i++){
            if(hs.remove(nums[i])){
                int count=1;
                int left=nums[i]-1, right=nums[i]+1;
                while(hs.remove(left--)){
                    count++;
                }
                while(hs.remove(right++)){
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}