class Solution {
    public void setZeroes(int[][] A) {
        boolean top=false,left=false;
        int N=A.length,M=A[0].length;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]==0){
                    if(i==0) top=true;
                    if(j==0) left=true;
                    if(i>0 && j>0) A[0][j]=A[i][0]=0;
                }
            }
        }
        for(int i=1;i<N;i++){
            for(int j=1;j<M;j++){
                if(A[0][j]==0 || A[i][0]==0){
                    A[i][j]=0;
                }
            }
        }
        if(top){
            for(int i=0;i<M;i++){
                A[0][i]=0;
            }
        }
        if(left){
            for(int i=0;i<N;i++){
                A[i][0]=0;
            }
        }
    }
}