class Solution {
    public int singleNonDuplicate(int[] A) {
        int N=A.length;
        int s=0, e=N-1;
        while(s<=e){
            int mid =(s+e)/2;
            if(mid<N-1 && A[mid]==A[mid+1]){
                if((mid-s+1)%2==0) e=mid-1;
                else s=mid+2;
            }
            else if(mid>0 && A[mid]==A[mid-1]){
                if((mid-s+1)%2==0) s=mid+1;
                else e=mid-2;
            }
            else return A[mid];
        }
        return -1;
    }
}