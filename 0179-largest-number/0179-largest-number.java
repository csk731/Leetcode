import java.util.*;
class Solution {
    class MyComparator implements Comparator<Integer>{
        public int compare(Integer i, Integer j){
            return (j+""+i).compareTo(i+""+j);
        }
    }
    public String largestNumber(int[] nums) {
        int N=nums.length;
        Integer n[]=new Integer[N];
        for(int i = 0;i<nums.length;i++) n[i] = nums[i];
        StringBuffer sb=new StringBuffer();
        Arrays.sort(n, new MyComparator());
        for(int i=0;i<N;i++){
            sb.append(n[i]);
        }
        return (sb.charAt(0)=='0')?"0":sb.toString();
    }
}