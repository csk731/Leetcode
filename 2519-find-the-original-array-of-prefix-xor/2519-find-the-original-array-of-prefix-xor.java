class Solution {
    public int[] findArray(int[] pref) {
        int N=pref.length;
        int ans[]=new int[N];
        for(int i=0;i<N;i++){
            int val=0;
            if(i>0) val=pref[i-1];
            ans[i]=pref[i]^val;
        }
        return ans;
    }
}