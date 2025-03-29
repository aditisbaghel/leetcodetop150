class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        
     if(s == null || s.length == 0)
	    return null;
	
	Map<String, List<String>> map = new HashMap<String, List<String>>();
	for(String word : s) {
	    String currMap = countCharacter(word);
	    if(!map.containsKey(currMap))
	    {
	        map.put(currMap, new ArrayList<>());
	    }
	    map.get(currMap).add(word);
	    //map.computeIfAbsent(currMap, x-> new ArrayList<>()).add(word);
	    
	}
	return new ArrayList<>(map.values());
	
	
}
public static String countCharacter(String s)
{
    int[] map = new int[26];
    for(char c : s.toCharArray())
    {
        map[c - 'a']++;
    }
    return Arrays.toString(map);
	
	
}}