class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        long s=0,e=x,mid=0;
        while(s<=e){
            mid=(s+e)/2;
            if((x/mid)<mid) e=mid-1;
            else if((x/mid)>mid) s=mid+1;
            else return (int)mid;
        }
        return (int)e;
    }
    
}