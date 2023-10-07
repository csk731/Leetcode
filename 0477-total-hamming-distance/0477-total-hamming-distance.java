class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans=0,i=0;
        while(i<32){
            int zc=0,oc=0;
            for(int x:nums){
                if(((x>>i)&1)==0) zc++;
                else oc++;
            }
            ans+=(zc*oc);
            i++;
        }
        return ans;
    }
}