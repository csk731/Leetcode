//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    int[] s1=new int[]{1,-1,0,0,-1,1,1,-1};
    int[] s2=new int[]{0,0,1,-1,-1,1,-1,1};
    public void formIsland(int i, int j, char[][] grid, int[][] visited){
        visited[i][j]=1;
        int N=grid.length;
        int M=grid[0].length;
        for(int ind=0;ind<8;ind++){
            int x=i+s1[ind], y=j+s2[ind];
            if(x>=0 && x<N && y>=0 && y<M && grid[x][y]=='1' && visited[x][y]==0) formIsland(x,y,grid,visited);
        }
    }
    public int numIslands(char[][] grid) {
        int N=grid.length;
        int M=grid[0].length;
        int count=0;
        int visited[][]=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    count++;
                    formIsland(i,j,grid,visited);
                }
            }
        }
        return count;
    }
}