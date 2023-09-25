class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
        int N=nums.length;
        hm.put(0,-1);
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=nums[i];
            sum%=k;
            if((hm.containsKey(sum) && i-hm.get(sum)>=2)) return true;
            if(!hm.containsKey(sum)) hm.put(sum,i);
        }
        return false;
    }
}