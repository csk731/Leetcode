class Solution {
    public int setBits(int num2){
        int count=0, i=0;
        while(i<32){
            if(((num2>>i)&1)==1) count++;
            i++;
        }
        return count;
    }
    public int minimizeXor(int num1, int num2) {
        int i=31, x=0;
        num2=setBits(num2);
        while(num2>0 && i>=0){
            if(((num1>>i)&1)==1){
                x|=(1<<i);
                num2--;
            }
            i--;
        }
        int j=0;
        while(num2>0 && j<31){
            if(((num1>>j)&1)==0){
                x|=(1<<j); 
                num2--;
            }
            j++;
        }
        return x;
    }
}