class Solution {
    public int mySqrt(int x) {
        int s=0, e=x;
        while(s<=e){
            long mid=(s+e)/2;
            long temp=mid*mid;
            if(temp==x) return (int)mid;
            else if(temp<x) s=(int)mid+1;
            else e=(int)mid-1;
        }
        return e;
    }
}