class Solution {
    List<String> list=new ArrayList<>();
    public void run(int flag, StringBuffer sb, int N){
        if(flag<0) return;
        int n=sb.length();
        if(n==N){
            if(flag==0) list.add(sb.toString());
            return;
        }
        run(flag+1,sb.append("("),N);
        run(flag-1,sb.replace(n,n+1,")"),N);
        sb.deleteCharAt(n);
    }
    public List<String> generateParenthesis(int n) {
        run(0,new StringBuffer(),2*n);
        return list;
    }
}