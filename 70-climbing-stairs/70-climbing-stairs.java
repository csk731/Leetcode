class Solution {
    int temp=0;
    public int climbStairs(int n) {
        int t1=0,t2=1;
        for(int i=1;i<=n;i++){
            int temp=t1;
            t1=t2;
            t2=temp+t2;
        }
        return t2;
    }
}