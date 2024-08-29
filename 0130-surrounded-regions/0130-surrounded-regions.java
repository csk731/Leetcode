class Solution {
    int x[] = {-1,1,0,0};
    int y[] = {0,0,1,-1};
    private void explore(int i, int j, int visited[][],char board[][], int m, int n){
        visited[i][j] = 1;
        for(int idx=0;idx<4;idx++){
            int newI = x[idx]+i;
            int newJ= y[idx]+j;
            if(newI>=0 && newI<m && newJ>=0 && newJ<n && board[newI][newJ]=='O' && visited[newI][newJ]==0){
                explore(newI, newJ, visited, board, m, n);
            }
        }
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int visited[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0 || j==0 || i==m-1 || j==n-1) && board[i][j]=='O' && visited[i][j]==0) {
                    explore(i,j,visited,board,m,n);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && visited[i][j]==0){
                    board[i][j]='X';
                }
            }
        }
    }
}