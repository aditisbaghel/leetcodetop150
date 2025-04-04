import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> arr = new ArrayList<Map.Entry<Integer,Integer>>(hm.entrySet());
        Collections.sort(
            arr,
            new Comparator<Map.Entry<Integer,Integer>>(){
                public int compare(Map.Entry<Integer,Integer> o1,
                Map.Entry<Integer,Integer> o2){
                    if(o1.getValue()==o2.getValue()){
                        return o2.getKey()-o1.getKey();
                    }
                    else{
                        return o2.getValue()-o1.getValue();
                    }
                };
            }
        );
        int[] arr1 = new int[k];
        for(int i=0;i<k;i++){
            arr1[i]=arr.get(i).getKey();
        }
        return arr1;
    }
}