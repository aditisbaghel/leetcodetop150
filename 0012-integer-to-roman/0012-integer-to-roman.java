import java.util.Map.Entry;
class Solution {
    public String intToRoman(int num) {
        HashMap<String,Integer> hmap = new LinkedHashMap<String, Integer>();
        hmap.put("M",1000);
        hmap.put("CM",900);
        hmap.put("D",500);
        hmap.put("CD",400);
        hmap.put("C",100);
        hmap.put("XC",90);
        hmap.put("L",50);
        hmap.put("XL",40);
        hmap.put("X",10);
        hmap.put("IX",9);
        hmap.put("V",5);
        hmap.put("IV",4);
        hmap.put("I",1);
    StringBuilder result =new StringBuilder();
    for(Entry<String,Integer> entrys:hmap.entrySet()){
         while(num>=entrys.getValue()){
            result.append(entrys.getKey());
            num-=entrys.getValue();
        }
    }
    return result.toString();
    }  
}