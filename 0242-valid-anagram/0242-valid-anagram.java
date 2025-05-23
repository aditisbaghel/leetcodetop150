class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i =0;i<s.length();i++){
            hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i =0;i<s.length();i++){
            if(hmap.get(t.charAt(i))==null || hmap.get(t.charAt(i))<1)
            return false;
            else
            hmap.put(t.charAt(i),hmap.get(t.charAt(i))-1);
        }
        return true;
    }
}