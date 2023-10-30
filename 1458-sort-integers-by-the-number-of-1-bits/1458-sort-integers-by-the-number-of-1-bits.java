class Solution {
    class BitComparator implements Comparator<Integer>{
        public int compare(Integer i, Integer j){
            int x=0, ci=0, cj=0;
            while(x<32){
                ci+=((i>>x)&1);
                cj+=((j>>x)&1);
                x++;
            }
            return (ci!=cj)?(ci-cj):(i-j);
        }
    }
    public int[] sortByBits(int[] arr) {
        int N=arr.length;
        Integer a[]=new Integer[N];
        for(int i=0;i<N;i++){
            a[i]=arr[i];
        }
        Arrays.sort(a,new BitComparator());
        for(int i=0;i<N;i++){
            arr[i]=a[i];
        }
        return arr;
    }
}