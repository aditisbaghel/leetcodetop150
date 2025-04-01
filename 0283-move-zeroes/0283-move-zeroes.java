class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while (i<nums.length-1 && j<nums.length) {
            if(i==j){
                j++;
                continue;
            }
            if (nums[i] == 0 && nums[j]!=0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            if (nums[i] == 0 && nums[j]==0){
                j++;
                continue;
            }
            i++;
        }
    }
}