class Solution {
    public void dfs(int node, ArrayList<Integer>[] adj, int[] visited){
        visited[node]=1;
        for(int i=0;i<adj[node].size();i++){
            int neigh=adj[node].get(i);
            if(visited[neigh]==0){
                dfs(neigh,adj,visited);
            }
        }
    }
    public boolean validPath(int n, int[][] B, int source, int destination) {
        if(source==destination) return true;
        int[] visited=new int[n];
        ArrayList<Integer>[] adj=new ArrayList[n];
        int M=B.length;
        for(int i=0;i<M;i++){
            if(adj[B[i][0]]==null) adj[B[i][0]]=new ArrayList<Integer>();
            if(adj[B[i][1]]==null) adj[B[i][1]]=new ArrayList<Integer>();
            adj[B[i][0]].add(B[i][1]);
            adj[B[i][1]].add(B[i][0]);
        }
        dfs(source,adj,visited);
        return visited[destination]==1;
    }
}