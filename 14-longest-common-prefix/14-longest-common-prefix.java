class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str=strs[0];
        for(int i=1;i<strs.length;i++){
            StringBuffer temp=new StringBuffer();
            for(int j=0;j<Math.min(str.length(),strs[i].length());j++){
                if(str.charAt(j)==strs[i].charAt(j)) temp.append(str.charAt(j));
                else break;
            }
            str=temp.toString();
        }
        return str;
    }
}