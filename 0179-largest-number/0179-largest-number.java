import java.util.*;
class Solution {
    class MyComparator implements Comparator<Integer>{
        public int compare(Integer i, Integer j){
            return (""+j+i).compareTo(""+i+j);
        }
    }
    public String largestNumber(int[] nums) {
        int N=nums.length;
        Integer[] arr=new Integer[N];
        for(int i=0;i<N;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,new MyComparator());
        StringBuffer sb=new StringBuffer();
        for(int n:arr){
            sb.append(n);
        }
        return (arr[0]==0) ? "0" : sb.toString();
    }
}