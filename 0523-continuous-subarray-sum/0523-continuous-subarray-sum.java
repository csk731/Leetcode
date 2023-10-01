class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int N=nums.length, sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<N;i++){
            sum=(sum%k+nums[i]%k)%k;
            if(hm.containsKey(sum%k)){
                if(i-hm.get(sum%k)>=2) return true;
            }
            else hm.put(sum%k,i);
        }
        return false;
    }
}