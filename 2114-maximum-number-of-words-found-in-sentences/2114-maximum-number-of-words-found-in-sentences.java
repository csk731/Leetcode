class Solution {
    public int mostWordsFound(String[] sentences) {
        int  max=0,N=sentences.length;
        for(int i=0;i<N;i++){
            int num=1,len=sentences[i].length();
            for(int j=0;j<len;j++){
                if(sentences[i].charAt(j)==' ') num++;
            }
            max=Math.max(max,num);
        }
        return max;
    }
}