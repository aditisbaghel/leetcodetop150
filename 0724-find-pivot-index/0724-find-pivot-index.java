class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=1; i<nums.length; i++){
            nums[i]+=nums[i-1];
        }
     for(int i=0; i<nums.length; i++){
            int leftSum = i>0?nums[i-1]:0;
            int rightSum = i<(nums.length-1)?(nums[nums.length-1]-nums[i]):0;
            if(leftSum==rightSum)
              return i;
        }
        return -1;
    }
}