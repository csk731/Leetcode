class Solution {
    public int reverse(int x) {
        int ans=0;
        int min=-2147483648, max=2147483647;
        while(x!=0){
            int lastVal=(x%10);
            if(ans>(max/10) || ans<(min/10)) return 0;
            ans=(ans*10)+lastVal;
            x/=10;
        }
        return ans;
    }
}