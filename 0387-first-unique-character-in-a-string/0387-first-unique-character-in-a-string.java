class Solution {
    public int firstUniqChar(String str) {
         if(str == null|| str.isEmpty()){
           return -1;
        }
        
        HashMap<Character,  Integer> charcount= new HashMap<>();
        
        for(int i=0; i< str.length();i++){
            char ch= str.charAt(i);
            int count= charcount.get(ch)!=null ? charcount.get(ch) :0;
            charcount.put(ch, count+1);
        }
        
        for(int i=0;i< str.length();i++){
            if(charcount.get(str.charAt(i))==1){
                return i;
            }
        }
        
        return -1;
    }
}