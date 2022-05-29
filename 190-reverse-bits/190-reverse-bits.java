public class Solution {
    // you need treat A as an unsigned value
    public int reverseBits(int A) {
        long ans=0,i=0;
        while(i<32){
            if(((A>>i)&1)==1) ans+=Math.pow(2,31-i);
            i++;
        }
        return (int)ans;
    }
}