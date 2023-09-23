class Solution {
    public int trap(int[] height) {
        Stack<Integer> stk=new Stack<Integer>();
        stk.push(0);
        int N=height.length;
        int leftMax=0;
        for(int i=N-1;i>0;i--){
            if(height[i]>stk.peek()) stk.push(height[i]);
            else stk.push(stk.peek());
        }
        int ans=0;
        for(int i=0;i<N;i++){
            int water=Math.min(leftMax,stk.pop())-height[i];
            if(water>0) ans+=water;
            leftMax=Math.max(leftMax,height[i]);
        }
        return ans;
    }
}