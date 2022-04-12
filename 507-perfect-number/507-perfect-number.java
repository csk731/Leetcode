class Solution {
    public boolean checkPerfectNumber(int num) {
        int count=(num==1)?0:1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                if(i==(num/i)) count+=i;
                else count+=(i+(num/i));
            }
        }
        return (num==count)?true:false;
    }
}