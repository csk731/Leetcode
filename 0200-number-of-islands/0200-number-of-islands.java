class Solution {
    int[] row=new int[]{0,0,1,-1};
    int[] col=new int[]{-1,1,0,0};
    public void formIsland(char[][] A, int[][] visited,int i, int j, int N, int M){
        visited[i][j]=1;
        for(int n=0;n<4;n++){
            int x=i+row[n];
            int y=j+col[n];
            if(x>=0 && x<N && y>=0 && y<M && A[x][y]=='1' && visited[x][y]==0){
                formIsland(A,visited,x,y,N,M);
            }
        }
    }
    public int numIslands(char[][] A) {
        int islands=0, N=A.length, M=A[0].length;
        int[][] visited=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]=='1' && visited[i][j]==0){
                    islands++;
                    formIsland(A,visited,i,j,N,M);
                }
            }
        }
        return islands;
    }
}