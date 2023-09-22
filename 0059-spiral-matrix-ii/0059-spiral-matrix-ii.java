class Solution {
    public int[][] generateMatrix(int A) {
        int ans[][]=new int[A][A];
        int val=1;
        for(int i=0;i<A/2;i++){
            for(int a=i;a<A-i-1;a++){
                ans[i][a]=val++;
            }
            for(int b=i;b<A-i-1;b++){
                ans[b][A-i-1]=val++;
            }
            for(int c=A-i-1;c>i;c--){
                ans[A-i-1][c]=val++;
            }
            for(int d=A-i-1;d>i;d--){
                ans[d][i]=val++;
            }
        }
        if((A&1)==1) ans[A/2][A/2]=val;
        return ans;
    }
}