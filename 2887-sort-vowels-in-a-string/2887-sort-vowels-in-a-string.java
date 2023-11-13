class Solution {
    public String sortVowels(String s) {
        StringBuffer sb=new StringBuffer(s);
        int N=s.length();
        List<Character> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                list.add(ch);
            }
        }
        Collections.sort(list);
        int p=0,len=list.size();
        for(int i=0;i<N;i++){
            char ch=sb.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                sb.setCharAt(i,list.get(p++));
            }
        }
        return sb.toString();
    }
}