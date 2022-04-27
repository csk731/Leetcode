class Solution {
    /*
        // Stack Approach
        int max_profit=0;
        Stack<Integer> stk=new Stack<Integer>();
        for(int i=prices.length-1;i>0;i--){
            if(stk.empty()) stk.push(prices[i]);
            else if(prices[i]>stk.peek()) stk.push(prices[i]);
            else stk.push(stk.peek());
        }
        for(int i=0;i<prices.length-1;i++){
            if((stk.peek()-prices[i])>0) max_profit=Math.max(max_profit,stk.pop()-prices[i]);           
        }
        return max_profit;
        
    */
    public int maxProfit(int[] prices) {
        int max_profit=0,N=prices.length,max=prices[N-1];
        for(int i=N-2;i>=0;i--){
            if((max-prices[i])>max_profit) max_profit=max-prices[i];
            max=Math.max(max,prices[i]);
        }
        return max_profit;
    }
}