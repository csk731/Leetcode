class Solution {
    public String addBinary(String A, String B) {
        int N=A.length(),M=B.length(),carry=0,i=N-1,j=M-1;
        StringBuffer sb=new StringBuffer();
        while(i>=0 || j>=0){
            int a=carry;
            if(i>=0) a+=(A.charAt(i)-48);
            if(j>=0) a+=(B.charAt(j)-48);
            sb.append(a&1);
            carry=(a>>1)&1;
            i--;
            j--;
        }
        if(carry!=0) sb.append(carry);
        sb.reverse();
        return sb.toString();
    }
}