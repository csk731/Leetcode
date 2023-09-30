class Solution {
    public int sumOfSquares(int n){
        int num=n, sum=0;
        while(num>0){
            sum+=Math.pow(num%10,2);
            num/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n, fast=n;
        do{
            slow=sumOfSquares(slow);
            fast=sumOfSquares(sumOfSquares(fast));
        }while(slow!=fast);
        return (slow==1);
    }
}