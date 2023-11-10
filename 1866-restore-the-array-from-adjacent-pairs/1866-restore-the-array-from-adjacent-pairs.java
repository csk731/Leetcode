class Solution {
    int i=0, ans[];
    HashMap<Integer,List<Integer>> hm=new HashMap<>();
    public void dfs(int n){
        ans[i++]=n;
        List<Integer> list=hm.get(n);
        hm.remove(n);
        for(int x:list){
            if(hm.containsKey(x)) dfs(x);
        }
    }
    public int[] restoreArray(int[][] adjacentPairs) {
        int N=adjacentPairs.length;
        for(int i=0;i<N;i++){
            int n1=adjacentPairs[i][0];
            int n2=adjacentPairs[i][1];
            if(!hm.containsKey(n1)) hm.put(n1,new ArrayList<Integer>());
            hm.get(n1).add(n2);
            if(!hm.containsKey(n2)) hm.put(n2,new ArrayList<Integer>());
            hm.get(n2).add(n1);
        }
        for(int n:hm.keySet()){
            if(hm.get(n).size()==1) {
                ans=new int[N+1];
                dfs(n);
                break;
            }
        }
        return ans;
    }
}