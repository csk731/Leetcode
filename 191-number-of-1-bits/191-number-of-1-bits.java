public class Solution {
    // you need to treat n as an unsigned value
    public boolean bitCheck(int num,int x){
        return ((num&(1<<x))!=0);
    }
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if(bitCheck(n,i)) count++;
        }
        return count;
    }
}