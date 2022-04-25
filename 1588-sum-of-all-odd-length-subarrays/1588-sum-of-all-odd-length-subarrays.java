class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res=0,len=arr.length;
        for(int i=0;i<len;i++){
            res+=arr[i]*((((len-i)*(i+1))+1)/2);
        }
        return res;
    }
}