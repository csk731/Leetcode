class Solution {
    public int waysToMakeFair(int[] A) {
        int lesum=0,losum=0,resum=0,rosum=0;
        int N=A.length;
        for(int i=0;i<N;i++){
            if((i&1)==0) resum+=A[i];
            else rosum+=A[i];
        }
        int count=0;
        for(int i=0;i<N;i++){
            if((i&1)==0){
                resum-=A[i];
                if((lesum+rosum)==(losum+resum)) count++;
                lesum+=A[i];
            }
            else {
                rosum-=A[i];
                if((losum+resum)==(lesum+rosum)) count++;
                losum+=A[i];
            }
        }
        return count;
    }
}