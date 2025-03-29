class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mm = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            mm.put(magazine.charAt(i),mm.getOrDefault(magazine.charAt(i),0)+1);

        }
        for(int i=0;i<ransomNote.length();i++){
            if((mm.get(ransomNote.charAt(i))==null) || mm.get(ransomNote.charAt(i))<=0){
                return false;
            }
            else{
               mm.put(ransomNote.charAt(i),mm.get(ransomNote.charAt(i))-1); 
            }
        }
        return true;
    }
}