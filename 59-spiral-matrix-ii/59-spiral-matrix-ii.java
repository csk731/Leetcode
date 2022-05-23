class Solution {
    public int[][] generateMatrix(int A) {
        int ans=1;
        int res[][]=new int [A][A];
        for(int i=0;i<A/2;i++){
            for(int j=i;j<A-i-1;j++){
                res[i][j]=ans++;
            }
            for(int j=i;j<A-i-1;j++){
                res[j][A-i-1]=ans++;
            }
            for(int j=A-i-1;j>i;j--){
                res[A-i-1][j]=ans++;
            }
            for(int j=A-i-1;j>i;j--){
                res[j][i]=ans++;
            }
        }
        if((A&1)==1) res[A/2][A/2]=ans;
        return res;
    }
}