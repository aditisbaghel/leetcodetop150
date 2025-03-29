// public class Solution {
//     public int romanToInt(String s) {
//         // Basic input validation
//         if (!isValidRomanNumeral(s)) {
//             throw new IllegalArgumentException("Invalid Roman numeral: " + s);
//         }
        
//         // Your existing logic to convert Roman numeral to integer
//         int prev = 0;
//         String number = "";
//         ArrayList<Character> arr1 = new ArrayList<>(Arrays.asList('I','V','X','L','C','D','M'));
//         ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,5,10,50,100,500,1000));
        
//         for(int i=0; i<s.length(); i++) {
//             char ch = s.charAt(i);
//             int index1 = arr1.indexOf(ch);
            
//             if(index1 >= prev) {
//                 number += arr2.get(index1);
//             } else {
//                 number += (arr2.get(index1) - arr2.get(prev));
//             }
            
//             prev = index1;
//         }
        
//         return Integer.parseInt(number);
//     }
    
//     private boolean isValidRomanNumeral(String s) {
//         // Check if string contains only valid Roman numeral characters
//         String validCharacters = "IVXLCDM";
//         for (char ch : s.toCharArray()) {
//             if (validCharacters.indexOf(ch) == -1) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }


import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<Character, Integer> romanToIntMap = new HashMap<>();

    static {
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        // Basic input validation
        if (!isValidRomanNumeral(s)) {
            throw new IllegalArgumentException("Invalid Roman numeral: " + s);
        }
        
        int total = 0;
        int prevValue = 0;
            // int init =();
            // System.out.println(init);
            // System.out.println(s);
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            int currentValue = romanToIntMap.get(ch);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }

    private boolean isValidRomanNumeral(String s) {
        // Check if string contains only valid Roman numeral characters
        String validCharacters = "IVXLCDM";
        for (char ch : s.toCharArray()) {
            if (validCharacters.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }}