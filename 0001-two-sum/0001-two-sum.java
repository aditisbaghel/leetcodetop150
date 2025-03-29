class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i =0 ;i< nums.length;i++){
            if(hmap.containsKey(nums[i])){
                return new int[]{hmap.get(nums[i]),i};
            }
            else
            hmap.put(target-nums[i],i);
        }
        return new int[]{};
    }
}