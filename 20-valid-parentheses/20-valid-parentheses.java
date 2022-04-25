class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stk.empty() && ((s.charAt(i)==')' && stk.peek()=='(') || (s.charAt(i)=='}' && stk.peek()=='{') || (s.charAt(i)==']' && stk.peek()=='['))) stk.pop();
            else stk.push(s.charAt(i));
        }
        return stk.empty();
    }
}