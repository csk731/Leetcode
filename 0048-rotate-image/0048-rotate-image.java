class Solution {
    public void rotate(int[][] A) {
        int rows=A.length, cols=A.length;
        //transpose matrix
        for(int i=0; i<rows; i++){
            for(int j=i+1; j<cols; j++){
                A[i][j] = A[i][j] + A[j][i];
                A[j][i] = A[i][j] - A[j][i];
                A[i][j] = A[i][j] - A[j][i];
            }
        }
        for(int i=0;i<rows; i++){
            int s=0, e=cols-1;
            while(s<e){
                A[i][s] = A[i][s] + A[i][e];
                A[i][e] = A[i][s] - A[i][e];
                A[i][s] = A[i][s] - A[i][e];
                s++;
                e--;
            }
        }
    }
}