class Solution {
    public int romanToInt(String s) {
        int res=0,len=s.length();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        for(int i=0;i<len;i++){
            if(i<len-1 && (hm.get(s.charAt(i))<hm.get(s.charAt(i+1)))) res+=((-1*hm.get(s.charAt(i++))+hm.get(s.charAt(i))));
            else res+=hm.get(s.charAt(i));
        }
        return res;
    }
}