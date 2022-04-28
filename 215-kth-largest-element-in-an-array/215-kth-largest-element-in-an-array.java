class Solution {
    public int findKthLargest(int[] arr, int B) {
        int N=arr.length,temp=0;
        while(temp<B){
            int max_ind=0;
            for(int i=0;i<N-temp;i++){
                if(arr[i]>=arr[max_ind]) max_ind=i;
                if(i==N-temp-1 && i!=max_ind){
                    arr[i]=arr[i]+arr[max_ind];
                    arr[max_ind]=arr[i]-arr[max_ind];
                    arr[i]=arr[i]-arr[max_ind];
                }
            }
            temp++;
        }
        return arr[N-B];
    }
}