class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(x==0 || x==1) return x;
        double hp=myPow(x,n/2);
        if((n&1)==1) return (n>0)?(hp*hp*x):((hp*hp)/x);
        return hp*hp;
    }
}