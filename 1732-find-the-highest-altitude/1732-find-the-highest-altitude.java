class Solution {
    public int largestAltitude(int[] gain) {
        int temp=gain[0], max=(temp>0)?temp:0;
        for(int i=1;i<gain.length;i++){
            temp=gain[i]+temp;
            max=Math.max(max,temp);
        }
        return max;
    }
}