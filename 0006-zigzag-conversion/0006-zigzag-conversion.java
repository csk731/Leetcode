class Solution {
    public String convert(String s, int numRows) {
        int N=s.length();
        if(numRows==1 || numRows>=N) return s;
        List<StringBuffer> list=new ArrayList<>();
        int i=0,j=0;
        for(int k=0;k<numRows;k++){
            list.add(new StringBuffer());
        }
        while(i<N){
            char ch=s.charAt(i);
            j=i%(numRows-1);
            if(((i/(numRows-1))%2)!=0) j=numRows-1-j;
            list.get(j).append(ch);
            i++;
        }
        StringBuffer ans=new StringBuffer();
        for(StringBuffer sb:list){
            ans.append(sb);
        }
        return ans.toString();
    }
}