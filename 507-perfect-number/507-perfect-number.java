class Solution {
    public boolean checkPerfectNumber(int num) {
        int count=(num==1)?0:1;
        int N=(int)Math.sqrt(num);
        for(int i=2;i<=N;i++){
            if(num%i==0 && i==(num/i)) count+=i;
            else if(num%i==0) count+=(i+(num/i));
        }
        return (num==count)?true:false;
    }
}