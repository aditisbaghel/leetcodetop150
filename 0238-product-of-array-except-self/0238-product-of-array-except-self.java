class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i = 1;i<nums.length;i++){
            result[i] = nums[i-1]*result[i-1];
        }
        prod = 1;
        for(int i = result.length-2;i>=0;i--){
            prod = prod*nums[i+1];
            result[i] = prod*result[i];
        }
      return result;
    }
   
}