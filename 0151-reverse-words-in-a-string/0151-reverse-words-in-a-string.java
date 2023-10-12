class Solution {
    public void rev(int i, int j, StringBuffer sb){
        while(i<j){
            char ch1=sb.charAt(i);
            char ch2=sb.charAt(j);
            sb.setCharAt(i,ch2);
            sb.setCharAt(j,ch1);
            i++;
            j--;
        }
    }
    public String reverseWords(String A) {
        A=A.trim();
        StringBuffer sb=new StringBuffer();
        sb.append(A);
        int N=A.length();
        rev(0,N-1,sb);
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i)==' ' && sb.charAt(i-1)==' ') sb.deleteCharAt(i--);
        }
        int len=sb.length();
        int s=0;
        for(int e=0;e<len;e++){
            if(e==len-1 || sb.charAt(e+1)==' '){
                rev(s,e,sb);
                s=e+2;
            }
        }
        return sb.toString();
    }
}