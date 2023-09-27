class Solution {
    public int maxArea(int[] A) {
        int N=A.length, i=0, j=N-1;
        int ans=0;
        while(i<j){
            if(A[i]<A[j]){
                ans=Math.max(ans,(j-i)*A[i]);
                i++;
            }
            else{
                ans=Math.max(ans,(j-i)*A[j]);
                j--;
            }
        }
        return ans;
    }
}