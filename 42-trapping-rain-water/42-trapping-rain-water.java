class Solution {
    public int trap(int[] A) {
        int N=A.length,volume=0,leftmax=0,rightmax=0;
        int left=0,right=N-1;
        while(left<=right){
            if(A[left]>A[right]){
                if(A[right]>=rightmax) rightmax=A[right];
                else volume+=(rightmax-A[right]); 
                right--;
            }
            else{
                if(A[left]>=leftmax) leftmax=A[left];
                else volume+=(leftmax-A[left]); 
                left++;
            }
        }
        return volume;
    }
}