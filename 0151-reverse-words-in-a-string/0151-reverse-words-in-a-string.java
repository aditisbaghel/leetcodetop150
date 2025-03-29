class Solution {
    public String reverseWords(String s) {
        // " A B # C#D# E # ".trim().split("\\s*#\\s*")
        String[] splitstr = s.trim().split("\\s+");
        int start = 0;
        int end = splitstr.length-1;
        // for(String str : splitstr){
        //     if(str.trim().equals("")){

        //     }
        // }
        // a:
        while(start<end){
            // if(splitstr[end].trim().equals("")){
            //     if(end==splitstr.length-1)
            //     {
            //      end--;
            //     continue a   
            //     }
                
            //     splitstr[end] = splitstr[splitstr.length-1];
            //     splitstr[splitstr.length-1] = "";
            //     // end--;
            //     continue a;
            // }
            // if(splitstr[start].trim().equals("")){
            //     start++;
            //     continue a;
            // }
            
            String temp = splitstr[end].trim();
            splitstr[end] = splitstr[start].trim();
            splitstr[start] = temp;
            // System.out.println("splitstr[start]:"+splitstr[end]+":splitstr[end]:"+splitstr[start]);

            start++;
            end--;
        }
        // if(start==end){
        //     System.out.println("splitstr[start]:"+splitstr[end]+":splitstr[end]:"+splitstr[start]);
        //     splitstr[start]=splitstr[start].trim();
        // }
        return String.join(" ", splitstr).trim();
    }
}