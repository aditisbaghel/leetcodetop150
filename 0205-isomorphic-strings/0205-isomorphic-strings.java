class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hmap = new HashMap<>();
    if(s.length()!=t.length())
        return false;
for(int i=0;i<s.length();i++){
    if(hmap.get(s.charAt(i))==null && hmap.containsValue(t.charAt(i))){
        return false;
    }
    if(hmap.get(s.charAt(i))==null )
    hmap.put(s.charAt(i),t.charAt(i));
}
StringBuilder strb = new StringBuilder();
for(int i=0;i<s.length();i++){
strb.append(hmap.get(s.charAt(i))+"");
}
return strb.toString().equals(t);
    }
}