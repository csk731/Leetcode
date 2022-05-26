class Solution {
    public int trap(int[] A) {
        int N=A.length,volume=0,leftmax=A[0];
        Stack<Integer> stk=new Stack<Integer>();
        for(int i=N-1;i>1;i--){
            if(stk.empty()) stk.push(A[i]);
            else if(A[i]>stk.peek()) stk.push(A[i]);
            else stk.push(stk.peek());
        }
        for(int i=1;i<N-1;i++){
            int temp=Math.min(leftmax,stk.pop())-A[i];
            if(temp>0) volume+=temp;
            if(A[i]>leftmax) leftmax=A[i];
        }
        return volume;
    }
}