class Solution {
    public int hIndex(int[] citations) {
    Arrays.sort(citations);
    int result = 0;
    for(int i=0; i<citations.length ; i++){
        int h = citations.length-i;
        if(h<=citations[i]){
            return h;
        }
    }
    return result;
}
}