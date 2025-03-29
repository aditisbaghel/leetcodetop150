class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int i = str.lastIndexOf(" ");
        return str.substring(i+1).length();
    }
}