class Solution {
    public int countPrimes(int N) {
        if(N<2) return 0;
        int ans=0;
        boolean prime[]=new boolean[N];
        for(int i=2;i<N;i++){
            if(!prime[i]) {
                ans++;
                for(int j=2*i;j<N;j+=i){
                    prime[j]=true;
                }
            }
        }
        return ans++;
    }
}