class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<List<Integer>>();
        int N=nums.length;
        for(int i=0;i<N-2;i++){
            int target=-1*nums[i], s=i+1, e=N-1;
            while(s<e){
                int sum=nums[s]+nums[e];
                if(sum<target) s++;
                else if(sum==target){
                    set.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[s],nums[e])));
                    s++;
                    e--;
                }
                else e--;
            }
        }
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        list.addAll(set);
        return list;
    }
}