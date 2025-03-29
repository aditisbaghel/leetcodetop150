class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        s=s.toLowerCase();
        StringBuffer strb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            // if(s.charAt(i)>'z' || s.charAt(i)<'a')
            // if(s.charAt(i)!='0' ||
            // s.charAt(i)!='1' ||
            // s.charAt(i)!='2' ||
            // s.charAt(i)!='3' ||
            // s.charAt(i)!='4' ||
            // s.charAt(i)!='5' ||
            // s.charAt(i)!='6' ||
            // s.charAt(i)!='7' ||
            // s.charAt(i)!='8' ||
            // s.charAt(i)!='9'
            // )
            if(!Character.isLetterOrDigit(s.charAt(i)))
            continue;
            strb.append(s.charAt(i));
            }
            strb.toString();
           int end=strb.length()-1;
        for(int i=0;i<strb.length();i++){
            if(start!=end && strb.charAt(start)!=strb.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}