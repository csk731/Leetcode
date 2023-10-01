class Solution {
    public int alternatingSubarray(int[] nums) {
        int ans=0;
        int N=nums.length;
        int s=0,e=0,max=-1;
        while(e<N){
            int slope=(int)Math.pow(-1,e-s+1);
            if(s==e) e++;
            else if(slope==nums[e]-nums[e-1]){
                if(e-s+1>=2) max=Math.max(max,e-s+1);
                e++;
            }
            else if(1==nums[e]-nums[e-1]) s=e-1;
            else s=e;
        }
        return max;
    }
}