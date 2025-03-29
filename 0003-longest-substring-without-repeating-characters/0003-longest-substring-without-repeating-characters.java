class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int right=0,left=0,len=0;
        while(right<s.length()){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                right++;
                len= Math.max(len,hs.size());
                    }
            else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return len;
    }
}