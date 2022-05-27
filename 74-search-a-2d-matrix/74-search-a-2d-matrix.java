class Solution {
    public boolean searchMatrix(int[][] A, int B) {
        int N=A.length,M=A[0].length;
        int s=0,e=N-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(A[mid][M-1]==B) return true;
            else if(A[mid][M-1]>B) e=mid-1;
            else s=mid+1;
        }
        if(s>N-1) return false;
        int ind=s;
        s=0;e=M-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(A[ind][mid]==B) return true;
            else if(A[ind][mid]>B) e=mid-1;
            else s=mid+1;
        }
        return false;
    }
}