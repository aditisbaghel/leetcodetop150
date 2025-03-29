class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length<1)
            return 0;
      int max = 0;
      int cand = nums[0];
      HashMap<Integer, Integer> hmap = new HashMap<>();
      for(int i=0; i<nums.length;i++){
        if(!hmap.containsKey(nums[i])){
            hmap.put(nums[i],1);
        }
        else{
            int p = hmap.get(nums[i])+1;
            if(max<p)
             {max = p;
             cand = nums[i];
             }
            hmap.put(nums[i],p);
        }
      }
      return cand;
      }}