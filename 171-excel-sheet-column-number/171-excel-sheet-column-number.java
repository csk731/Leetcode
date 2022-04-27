class Solution {
    public int titleToNumber(String str) {
        int res=0,base=1,N=str.length();
        for(int i=0;i<N;i++){
            res+=((str.charAt(N-i-1)-64)*base);
            base*=26;
        }
        return res;
    }
}