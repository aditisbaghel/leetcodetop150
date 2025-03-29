class Solution {
    public int strStr(String haystack, String needle) {
        // boolean isTrue =false;
        // if(needle.length()>haystack.length())
        // return -1;
        // if(needle.length()==1)
        //     {
        //         return haystack.contains(needle)?haystack.indexOf(needle.charAt(0)):-1;
        //     }
        // for(int i=0;i<haystack.length()-needle.length();i++){
        // isTrue=needle.equals(haystack.substring(i,i+needle.length()))?true:false;
        // if(isTrue){
        //     return i;
        // }
        // }
        // return -1;
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(needle.charAt(0)==haystack.charAt(i)){
                if(needle.equals(haystack.substring(i,i+needle.length())))
                return i;
            }
        }
        return -1;
        
}}
    //     if(needle.length()>haystack.length())
    //         return -1;
    //     // if()
    //     int start =0, end =0;
    //     while(end<haystack.length() && start<needle.length()){
    //         if(needle.charAt(start)==(haystack.charAt(end))){
    //             System.out.println(start+"==========="+end);
    //             start++;
    //             end++;
    //         }else{
    //             start=0;
    //             end =end-1;
    //             if(needle.charAt(start)!=(haystack.charAt(end)))
    //                 end++;
    //         }
    //         if(start==needle.length()){
    //             System.out.println(start+"==========="+end);
    //             return end-start;
    //         }
    //     }
    //     // for(int i=0;i<){}
    // return -1;
    // }
