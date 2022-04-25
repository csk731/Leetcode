class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++){
            arr.add(1);
            for(int j=i-1;j>0;j--){
                arr.set(j,arr.get(j)+arr.get(j-1));
            }
        }
        return arr;
    }
}