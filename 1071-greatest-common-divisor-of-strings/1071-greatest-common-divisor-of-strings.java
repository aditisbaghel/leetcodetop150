class Solution {
    int getHCF (int num1, int num2)
  {
    
    if (num1 == 0)
      return num2;
  
    if (num2 == 0)
      return num1;
   
    if (num1 == num2)
      return num1;
    
    if (num1 > num2)
      return getHCF (num1 - num2, num2);
    return getHCF (num1, num2 - num1);
  }
    public String gcdOfStrings(String str1, String str2) {
        int min = Math.min(str1.length(), str2.length());
        // if(str1.length()==min && (str1+str2).equals(str2+str1)){
            // Math.min(str1.lastIndexOf(str1.charAt(0)));
            // if(str1.lastIndexOf(str1.charAt(0))== str.length()-1){
            // int start1 = str1.lastIndexOf(str1.charAt(0));
            // String result = str1.substring(start);
            // }
        //     int start = str1.lastIndexOf(str1.charAt(0));
        //     String result = str1.substring(start);
        //      if(str1.compareTo(str2)%(str1.length())!=0 && (str1+result).equals(result+str1))
        //      return result;
        //      else if(str1.compareTo(str2)%(str1.length())==0){
        //         return str1;
        //      }
        //      else if(!(str1+result).equals(result+str1)){
        //         System.out.println("result+str1");
        //         String str12 = str1.substring(0,start);
        //         System.out.println(str12);
        //         System.out.println(str1.substring(0,start-1));
        //         int start12 = str12.lastIndexOf(str1.charAt(0));
        //         System.out.println(start12);
        //         return(str1.substring(start12));

        //      }
                
        // }
        // else if (str2.length()==min && (str1+str2).equals(str2+str1)){
        //     int start = str2.lastIndexOf(str2.charAt(0));
        //     String result = str2.substring(start);

        //     if(str2.compareTo(str1)%(str2.length())!=0 && (str2+result).equals(result+str2))
        //      return result;
        //      else if(str2.compareTo(str1)%(str2.length())==0){
        //         return str2;
        //      }
        //      else if(!(str2+result).equals(result+str2)){
        //         // System.out.println("result+str1");
        //         // String str12 = str1.substring(0,start);
        //         // System.out.println(str12);
        //         // System.out.println(str1.substring(0,start-1));
        //         // int start12 = str12.lastIndexOf(str1.charAt(0));
        //         // System.out.println(start12);
        //         // return(str1.substring(start12));
        //         String str12 = str2.substring(0,start);
        //         int start12 = str12.lastIndexOf(str2.charAt(0));
        //         return(str2.substring(start12));

        //      }
        // }
        
        //     return "";
        if((str1+str2).equals(str2+str1)){
            

            return (str1.substring(0,getHCF(str1.length(),str2.length())));
        }
        return "";
    }
}