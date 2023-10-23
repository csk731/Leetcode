class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1) return false;
        double a=Math.log(n);
        double b=Math.log(2);
        double c=a/b;
        return c%2==0;
    }
}