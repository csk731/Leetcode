class Solution {
    public int mySqrt(int x) {
        return (int)sqrt(1,x,x);
    }
    public long sqrt(long a,long b,int N){
        long mid=(a+b)/2;
        if(N==(mid*mid)||(a+1)==b) return mid;
        if(N<(mid*mid)) return sqrt(a,mid,N);
        return sqrt(mid,b,N);
    }
    
}