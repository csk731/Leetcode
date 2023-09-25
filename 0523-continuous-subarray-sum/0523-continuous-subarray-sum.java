class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
        int N=nums.length;
        int ps[]=new int[N+1];
        ps[0]=0;
        for(int i=1;i<=N;i++){
            ps[i]=((nums[i-1]%k)+(ps[i-1]%k))%k;
        }
        for(int i=0;i<=N;i++){
            if((hm.containsKey(ps[i]) && i-hm.get(ps[i])>=2)) return true;
            if(!hm.containsKey(ps[i])) hm.put(ps[i],i);
        }
        return false;
    }
}