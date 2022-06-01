class Solution {
    public int hammingDistance(int x, int y) {
        int i=0,count=0;
        while(i<32){
            if((x&1)!=(y&1)) count++;
            x>>=1;
            y>>=1;
            i++;
        }
        return count;
    }
}