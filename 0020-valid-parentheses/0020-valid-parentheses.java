class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        String str1 ="({[", str2 = ")}]";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(str1.indexOf(arr[i]+"")!=-1){
                st.push(arr[i]);
            }
            else if(str2.indexOf(arr[i]+"")!=-1){
                int j = str2.indexOf(arr[i]);
                if(st.isEmpty())
                return false;
                if(st.peek()==str1.charAt(j)){
                    st.pop();
                }
                else
                return false;
            }
        }
        if(st.size()==0)
        return true;
        else 
        return false;
    }
}