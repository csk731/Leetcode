class Solution {
    public int minMoves(int[] nums) {
        int steps=0,min=Integer.MAX_VALUE;
        for(int x:nums){
            min=Math.min(min,x);
        }
        for(int y:nums){
            steps+=(y-min);
        }
        return steps;
    }
}