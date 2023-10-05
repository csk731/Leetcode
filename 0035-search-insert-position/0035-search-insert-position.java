class Solution {
    public int searchInsert(int[] A, int B) {
        int N=A.length, s=0, e=N-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(A[mid]==B) return mid;
            else if(A[mid]<B) s=mid+1;
            else e=mid-1;
        }
        return s;
    }
}