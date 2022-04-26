class MinStack {
    
    int pointer=-1;
    ArrayList<Integer> arr;
    public MinStack() {
        arr=new ArrayList<Integer>();
    }
    
    public void push(int val) {
        arr.add(val);
        pointer++;
    }
    
    public void pop() {
        arr.remove(pointer--);
    }
    
    public int top() {
        return arr.get(pointer);
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int x:arr){
            min=Math.min(min,x);
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */