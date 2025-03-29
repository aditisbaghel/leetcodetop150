class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hmap = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length)
        return false;
        for(int i=0;i<pattern.length();i++){
            if(!hmap.containsKey(pattern.charAt(i)) && hmap.containsValue(arr[i])){
                return false;
            }
            if(!hmap.containsKey(pattern.charAt(i))){
                hmap.put(pattern.charAt(i),arr[i]);
            }
            else{
                if(!hmap.get(pattern.charAt(i)).equals(arr[i]))
                return false;
            }
        }
        return true;
    }
}