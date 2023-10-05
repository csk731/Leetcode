class Solution {
    public int window(int A[], int size){
        int N=A.length, sum=0, max=0;
        for(int i=0;i<N;i++){
            if(i<size) {
                sum+=A[i];
                max=sum;
            }
            if(i>=size){
                sum-=A[i-size];
                sum+=A[i];
                max=Math.max(sum,max);
            }
        }
        return max;
    }
    public int minSubArrayLen(int B, int[] A) {
        int N=A.length, s=1, e=N;
        while(s<=e){
            int mid=(s+e)/2;
            int maxsum=window(A,mid);
            if(maxsum==B) return mid;
            else if(maxsum<B) s=mid+1; 
            else e=mid-1;
        }
        return(s>N)?0:s;
    }
}