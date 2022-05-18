class Solution {
    public int[] getConcatenation(int[] nums) {
        int N=nums.length;
        int res[]=new int[2*N];
        for(int i=0;i<N;i++){
            res[i+N]=res[i]=nums[i];
        }
        return res;
    }
}