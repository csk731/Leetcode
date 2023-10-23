class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1) return false;
        double ans=Math.log(n)/Math.log(4);
        double floor=Math.floor(ans);
        return ans==floor;
    }
}