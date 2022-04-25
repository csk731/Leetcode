class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res=0,len=arr.length;
        for(int i=0;i<len;i++){
            res+=arr[i]*(Math.ceil(((len-i)*(i+1))/2.0f));
        }
        return res;
    }
}