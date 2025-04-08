class Solution {
    public boolean findSubarrays(int[] nums) {
      HashSet<Integer> hset = new HashSet<>();
      int sum=0;
      for(int i=1;i <nums.length; i++){
            sum+=nums[i]+nums[i-1];
            if(hset.contains(sum)){
                return true;
            }
            else
            hset.add(sum);
            sum=0;
      }  
      return false;
    }
}