class NumMatrix {

    int ps[][];
    public NumMatrix(int[][] A) {
        int N=A.length, M=A[0].length;
        ps=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                int left=0, top=0, diag=0;
                int main=A[i][j];
                if(i>0) top=ps[i-1][j];
                if(j>0) left=ps[i][j-1];
                if(i>0 && j>0) diag=ps[i-1][j-1];
                ps[i][j]=main+top+left-diag;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int m=0, l=0, t=0, a=0;
        if(row2>=0 && col2>=0) m=ps[row2][col2];
        if(row2>=0 && col1>=1) l=ps[row2][col1-1];
        if(row1>=1 && col2>=0) t=ps[row1-1][col2];
        if(row1>=1 && col1>=1) a=ps[row1-1][col1-1];
        return m+a-l-t;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */