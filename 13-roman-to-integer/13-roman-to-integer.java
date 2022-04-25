class Solution {
    public int romanToInt(String s) {
        int res=0,len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(i<len-1 && ch=='I' && s.charAt(i+1)=='V') res+=4;
            else if(i<len-1 && ch=='I' && s.charAt(i+1)=='X') res+=9;
            else if(i<len-1 && ch=='X' && s.charAt(i+1)=='L') res+=40;
            else if(i<len-1 && ch=='X' && s.charAt(i+1)=='C') res+=90;
            else if(i<len-1 && ch=='C' && s.charAt(i+1)=='D') res+=400;
            else if(i<len-1 && ch=='C' && s.charAt(i+1)=='M') res+=900;
            else{
                switch(ch){
                case('M'):
                    res+=1000;
                    continue;
                case('D'):
                    res+=500;
                    continue;
                case('C'):
                    res+=100;
                    continue;
                case('L'):
                    res+=50;
                    continue;
                case('X'):
                    res+=10;
                    continue;
                case('V'):
                    res+=5;
                    continue;
                case('I'):
                    res+=1;
                    continue;
                }
            }
            i++;
        }
        return res;
    }
}