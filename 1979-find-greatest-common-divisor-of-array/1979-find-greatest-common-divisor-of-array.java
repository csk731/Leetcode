class Solution {
    public int gcd(int A,int B){
        if(A==0) return B;
        return gcd(B%A,A);
    }
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            if(x<min) min=x;
            if(x>max) max=x;
        }
        return gcd(min,max);
    }
}