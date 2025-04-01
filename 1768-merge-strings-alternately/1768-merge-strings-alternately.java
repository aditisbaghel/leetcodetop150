class Solution {
    public String mergeAlternately(String word1, String word2) {
        

        int temp = word1.length();
        
        if(word1.length()>word2.length())
            {
                temp = word2.length();
            }
        char[] arr = new char[temp*2];
        for (int i = 0,j=0;j<temp;i=i+2,j++){
            arr[i] = word1.charAt(j);
            arr[i+1] = word2.charAt(j);
        }
        String result = String.copyValueOf(arr);
        System.out.println(word2.substring(temp));
        if(word1.length()==temp){
               return (result +""+ word2.substring(temp));
        }
        else{
            return (result + ""+word1.substring(temp));
        }

    }
}