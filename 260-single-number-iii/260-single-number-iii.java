class Solution {
    public int[] singleNumber(int[] A) {
        int xor=0;
        for(int element:A){
            xor^=element;
        }
        int i=0;
        while(i<32){
            if(((xor>>i)&1)==1) break;
            i++;
        }
        int num1=0,num2=0,N=A.length;
        for(int j=0;j<N;j++){
            if(((A[j]>>i)&1)==1) num1^=A[j];
            else num2^=A[j];
        }
        return new int[]{num2,num1};
    }
}