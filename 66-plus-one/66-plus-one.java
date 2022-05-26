class Solution {
    public int[] plusOne(int[] A) {
        int carry=1,N=A.length;
        for(int i=N-1;i>=0;i--){
            int temp=A[i]+carry;
            A[i]=temp%10;
            carry=temp/10;
            if(carry==0) return A;
        }
        int res[]=new int[N+1];
        res[0]=1;
        return res;
        
    }
}