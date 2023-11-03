class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        int i=0, val2=1;
        int N=target.length;
        while(val2<=n && i<N){
            list.add("Push");
            if(val2==target[i]) i++;
            else list.add("Pop");
            val2++;
        }
        return list;
    }
}