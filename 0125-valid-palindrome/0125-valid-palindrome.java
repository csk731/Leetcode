class Solution {
    public boolean isPalindrome(String s) {
        int N=s.length();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<N;i++){
            int num=s.charAt(i);
            if(num>=65 && num<=90) sb.append((char)(num+32));
            if(num>=97 && num<=122) sb.append((char)num);
            if(num>=48 && num<=57) sb.append((char)num);
        }
        int k=0, m=sb.length()-1;
        while(k<=m){
            if(sb.charAt(k)==sb.charAt(m)){
                k++;
                m--;
            }
            else return false;
        }
        return true;
    }
}