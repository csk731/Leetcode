class Solution {
    public int maxChunksToSorted(int[] A) {
        int N=A.length,max=-1,chunks=0;
        for(int i=0;i<N;i++){
            if(A[i]>max) max=A[i];
            if(max==i) chunks++;
        }
        return chunks;
    }
}