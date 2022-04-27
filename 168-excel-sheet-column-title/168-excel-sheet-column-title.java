class Solution {   
    public String convertToTitle(int columnNumber) {
        StringBuffer str=new StringBuffer();
        while(columnNumber>0){
            str.append((char)((columnNumber-1)%26+65));
            columnNumber=(columnNumber-1)/26;
        }
        str.reverse();
        return str.toString();
    }
}