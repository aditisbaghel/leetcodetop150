class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] str1 = new StringBuilder[numRows];
        boolean decrement= false;
        if(numRows==1){return s;}
        for(int i =0; i<numRows;i++){
            str1[i] = new StringBuilder();
        }
        int start = 0;
        for(char ch : s.toCharArray()){
            str1[start].append(ch);
            if(start ==0 || start== numRows-1){
                // start=0;
                decrement = !decrement;
            }
            start+=decrement?1:-1;
        }
        StringBuilder str2 = new StringBuilder();
        for(int i=0; i<numRows; i++){
            str2.append(str1[i]);
        }
        return str2.toString();
    }}
        // String[][] arr = new String[numRows][];

        // char[] sbc = s.toCharArray();
        // int ini = 1;
        // for(int i =0; i <sbc.length;i++){
        //     arr[ini-1][j] = sbc[i];
            
        //     if(ini==numRows){
        //         ini=1;
        //         // arr[ini][j]
        //         ++j;
        //     }
        //     ++ini;
        // }

    //     for(int k=0;k<numRows;k++){
           
    //         arr[k]="";
    //     }
    //     for(int j = 0,i=0;j<numRows && i<s.length();j++,i++){
    //          System.out.println(s.charAt(i));
    //          System.out.println("i ="+i+" j="+j);
    //         arr[j]=arr[j]+""+ s.charAt(i);
    //         if(i<s.length() && j==numRows-1){
    //             int l=numRows-2;
    //             i+=1;
    //             for(;l>=0;l--){
    //                 arr[l]= arr[l]+""+s.charAt(i);
    //                 System.out.println(" l ="+l);
    //                 System.out.println(s.charAt(i));
    //          System.out.println("i ="+i+" j="+j);
    //                 // i++;
    //             }
    //             j=1;
    //         }
    //     }
    //     String str ="";
    //    for(int i =0; i<numRows;i++){
    //     if(arr[i]!=null){
    //         System.out.println(arr[i]);
    //     }
    //     str = str+""+arr[i];
    //    } 
    //    return str;
    // }
// }
// return toString(arr);
// }