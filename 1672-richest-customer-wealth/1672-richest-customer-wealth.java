class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=-1,N=accounts.length;
        for(int i=0;i<N;i++){
            int wealth=0,len=accounts[i].length;
            for(int j=0;j<len;j++){
                wealth+=accounts[i][j];
            }
            max=Math.max(max,wealth);
        }
        return max;
    }
}