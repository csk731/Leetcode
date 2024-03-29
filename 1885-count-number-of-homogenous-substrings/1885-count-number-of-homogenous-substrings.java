class Solution {
    public int countHomogenous(String s) {
        int N=s.length(), MOD=1000000007;
        long count=0, ans=0;
        for(int i=0;i<N;i++){
            count++;
            if(i==N-1 || s.charAt(i) != s.charAt(i+1)){
                ans=(ans+(((count%MOD)*((count+1)%MOD))%MOD)/2)%MOD;
                count=0;
            }
        }
        return (int)(ans%MOD);
    }
}