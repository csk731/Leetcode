class Solution {
    public int search(int A[],int s, int e, int B){
        while(s<=e){
            int mid=(s+e)/2;
            if(A[mid]==B) return mid;
            else if(A[mid]>B) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
    
    public int search(int[] A, int B) {
        int fe=A[0],len=A.length,s=0,e=len-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(A[mid]>=fe) s=mid+1;
            else e=mid-1;
        }
        int x=search(A,0,s-1,B);
        return (x!=-1)?x:search(A,s,len-1,B);
    }
}