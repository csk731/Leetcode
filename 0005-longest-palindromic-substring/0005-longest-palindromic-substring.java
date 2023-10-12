class Solution {
    public String longestPalindrome(String s) {
        int N=s.length();
        int max=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<N;i++){
            int s1=i,e1=i;
            while(s1>=0 && e1<N && s.charAt(s1)==s.charAt(e1)){
                e1++;
                s1--;
            }
            int len1=e1-s1-1;
            if(len1>max){
                ans=s.substring(s1+1,e1);
                max=len1;
            }
            int s2=i,e2=i+1;
            while(s2>=0 && e2<N && s.charAt(s2)==s.charAt(e2)){
                e2++;
                s2--;
            }
            int len2=e2-s2-1;
            if(len2>max){
                ans=s.substring(s2+1,e2);
                max=len2;
            }
        }
        return ans;
    }
}