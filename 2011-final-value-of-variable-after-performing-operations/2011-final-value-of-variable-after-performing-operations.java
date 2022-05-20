class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result=0;
        int N=operations.length;
        for(int i=0;i<N;i++){
            if(operations[i].charAt(1)=='+') result++;
            else result--;
        }
        return result;
    }
}