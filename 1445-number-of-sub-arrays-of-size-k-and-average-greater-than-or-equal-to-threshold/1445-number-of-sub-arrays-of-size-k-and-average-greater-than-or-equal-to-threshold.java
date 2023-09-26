class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int N=arr.length;
        int sum=0, ans=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=k*threshold) ans++;
        for(int i=k;i<N;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            if(sum>=k*threshold) ans++;
        }
        return ans;
    }
}