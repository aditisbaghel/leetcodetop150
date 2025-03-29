class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int j = strs[0].length();
        int k = strs[strs.length-1].length();
        StringBuilder result = new StringBuilder();
        for(int i =0;i<j;i++){
            if(i<=k){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                return result.toString();
            }
            result.append(strs[0].charAt(i));}
        }
        return result.toString();
    }
}