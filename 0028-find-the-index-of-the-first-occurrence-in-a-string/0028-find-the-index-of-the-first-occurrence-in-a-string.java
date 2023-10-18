class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        String str=needle+"$"+haystack;
        int N=str.length();
        int lps[]=new int[N];
        for(int i=1;i<N;i++){
            int x=lps[i-1];
            while(str.charAt(i)!=str.charAt(x)){
                if(x==0){
                    x=-1;
                    break;
                }
                x=lps[x-1];
            }
            lps[i]=x+1;
        }
        for(int i=0;i<N;i++){
            if(n==lps[i]) return i-n-n;
        }
        return -1;
    }
}