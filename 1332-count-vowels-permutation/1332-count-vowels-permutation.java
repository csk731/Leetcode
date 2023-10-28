class Solution {
    public int countVowelPermutation(int n) {
        HashMap<Integer, int[]> hm=new HashMap<>();
        hm.put(0,new int[]{1});
        hm.put(1,new int[]{0,2});
        hm.put(2,new int[]{0,1,3,4});
        hm.put(3,new int[]{2,4});
        hm.put(4,new int[]{0});

        int MOD=1000000007;

        int[][] dp=new int[n][5];

        for(int i=0;i<5;i++){
            dp[0][i]=1;
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<5;j++){
                int val=0;
                int N=hm.get(j).length;
                for(int k=0;k<N;k++){
                    val=((val%MOD)+dp[i-1][hm.get(j)[k]]%MOD)%MOD;
                }
                dp[i][j]=val;
            }
        }
        int ans=0;
        for(int x:dp[n-1]){
            ans=((ans)%MOD+(x%MOD))%MOD;
        }
        return ans;
    }
}