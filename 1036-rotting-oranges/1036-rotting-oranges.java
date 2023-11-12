class Pair{
    int i,j,k;
    Pair(int i, int j, int k){
        this.i=i;
        this.j=j;
        this.k=k;
    }
}

class Solution {
    public int orangesRotting(int[][] A) {
        int N=A.length, M=A[0].length;
        int[][] visited=new int[N][M];
        int[] row=new int[]{0,0,-1,1};
        int[] col=new int[]{1,-1,0,0};
        Queue<Pair> q = new LinkedList<Pair>();
        int ic=0, fc=0;

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]!=0) ic++;
                if(A[i][j]==2){
                    visited[i][j]=1;
                    fc++;
                    q.add(new Pair(i,j,0));
                }
            }
        }

        int ans=0;

        while(!q.isEmpty()){
            Pair pair=q.poll(); 
            for(int i=0;i<4;i++){
                int x=(pair.i)+row[i];
                int y=(pair.j)+col[i];
                if((x>=0 && x<N) && (y>=0 && y<M) && A[x][y]==1 && visited[x][y]==0){
                    visited[x][y]=1;
                    fc++;
                    q.add(new Pair(x,y,(pair.k)+1));
                }
            }
            if(q.isEmpty()) ans=pair.k;
        }
        return (ic==fc)?ans:-1;
    }
}