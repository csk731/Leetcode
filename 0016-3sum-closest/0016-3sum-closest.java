class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int N=nums.length;
        int min=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<N;i++){
            int p1=i+1, p2=N-1;
            while(p1<p2){
                int sum=nums[i]+nums[p1]+nums[p2];
                if(sum<=target) p1++;
                else p2--;
                int absVal=Math.abs(target-sum);
                if(absVal<min){
                    min=absVal;
                    ans=sum;
                }
            }
        }
        return ans;
    }
}