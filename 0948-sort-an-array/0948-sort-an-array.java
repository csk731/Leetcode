class Solution {
    
    // Max Heap Approach
    
    public void downHeapify(int i, int[] arr, int ptr){
        int idx1=(2*i)+1, idx2=(2*i)+2;
        int N=arr.length;
        if(idx1>ptr) return;
        int max=i;
        if(idx1<=ptr && arr[idx1]>arr[max]) max=idx1;
        if(idx2<=ptr && arr[idx2]>arr[max]) max=idx2;
        if(max!=i){
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
            downHeapify(max,arr,ptr);
        }
    }
    public void buildHeap(int[] arr){
        int N=arr.length;
        int idx=N-1;
        for(int i=idx;i>=0;i--){
            downHeapify(i,arr,N-1);
        }
    }
    public int[] sortArray(int[] arr) {
        int N=arr.length;
        buildHeap(arr);
        int ptr=N-1;
        while(N!=0){
            int temp=arr[0];
            arr[0]=arr[ptr];
            arr[ptr]=temp;
            ptr--;
            downHeapify(0,arr,ptr);
            N--;
        }
        return arr;
    }
}