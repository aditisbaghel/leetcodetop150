class Solution {
    public boolean isVowel(char ch){
        String str ="AEIOUaeiou";
        if(str.contains(ch+""))
            return true;
        return false;
    }
    public String reverseVowels(String s) {
     char[] newch = s.toCharArray();
     int start = 0;
     int end = newch.length-1;
    while(start<end){
        if(!isVowel(newch[start]))
            start++;
        else if(!isVowel(newch[end]))
            end--;
        else{
            char temp = newch[start];
            newch[start] = newch[end];
            newch[end] = temp;
            start++;
            end--;
        }
        
    }
     return new String(newch);
    }
}