class Solution {
    public int subarraySum(int[] nums, int k) {
        int N=nums.length;
        int ans=0, temp=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        hm.put(0,1);
        for(int i=0;i<N;i++){
            temp+=nums[i];
            if(hm.containsKey(temp-k)) ans+=(hm.get(temp-k));
            if(hm.containsKey(temp)) hm.put(temp,hm.get(temp)+1);
            else hm.put(temp,1);
        }
        return ans;
    }
}