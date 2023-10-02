class Solution {
    public void sortColors(int[] A) {
        int N=A.length,i=0,j=0,k=N-1;
        while(j<=k){
            if(A[j]<1){
                A[j]=A[i];
                A[i]=0;
                i++;
                j++;
            }
            else if(A[j]>1){
                A[j]=A[k];
                A[k]=2;
                k--;
            }
            else j++;
        }
    }
}