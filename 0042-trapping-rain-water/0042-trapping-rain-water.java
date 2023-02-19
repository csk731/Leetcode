class Solution {
    public int trap(int[] height) {
        Stack<Integer> stk=new Stack<>();
        for(int i=height.length-1;i>=0;i--){
            if(stk.empty() || height[i]>=(stk.peek())) stk.push(height[i]);
            else stk.push(stk.peek());
        }
        int leftMax=0, ans=0;
        for(int i=0;i<height.length;i++){
            stk.pop();
            if(!stk.empty()){
                int val=(Math.min(leftMax,stk.peek())-height[i]);
                if(val>0) ans+=val;
            }
            if(height[i]>leftMax) leftMax=height[i];
        }
        return ans;
    }
}