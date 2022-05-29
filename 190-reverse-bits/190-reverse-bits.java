public class Solution {
    // you need treat A as an unsigned value
    public int reverseBits(int A) {
        int ans=0,i=0;
        while(i<32){
            ans<<=1;
            if((A&1)==1) ans|=1;
            A>>=1;
            i++;
        }
        return ans;
    }
}