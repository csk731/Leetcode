class Solution {
    public int myAtoi(String s) {
        long ans=0;
        int i=0, flag=1;
        int N=s.length();
        int max=Integer.MAX_VALUE, min=Integer.MIN_VALUE;
        while(i<N){
            int ch=s.charAt(i);
            if(ch!=32) break;
            i++;
        }
        if(i<N && s.charAt(i)==45){
            flag=-1;
            i++;
        }
        else if(i<N && s.charAt(i)==43) i++;
        while(i<N){
            int ch=s.charAt(i);
            if(ch>=48 && ch<=57){
                // if(flag==1 && (ans>(max/10) || ((ans)==max/10 && (ch-48)>7))) return max;
                // if(flag==-1 && (flag*ans<(min/10) || ((flag*ans)==min/10 && (ch-48)<-8))) return min;
                if(flag==1 && (ans*10)+(ch-48)>max) return max;
                if(flag==-1 && flag*((ans*10)+(ch-48))<min) return min;
                ans=(ans*10)+(ch-48);
            }
            else break;
            i++;
        }
        return (int)ans*flag;
    }
}