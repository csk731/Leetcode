class Solution {
    public int getWinner(int[] arr, int k) {
        int fir=0, sec=1;
        int ele=-1, eleCount=0;
        int N=arr.length;
        while(sec<N){
            if(arr[fir]<arr[sec]) fir=sec;
            sec++;
            if(arr[fir]!=ele){
                ele=arr[fir];
                eleCount=1;
            }
            else eleCount++;
            if(eleCount==k) break;
        }
        return arr[fir];
    }
}