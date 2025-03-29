class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int count =0;
        for(int i= 0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[count] = nums[i];
                count++;
            }
        }

        // int j = nums.length - 2;
        // int k = nums.length - 1;

        // while (j >= 0 && k>=0) {
        //     if (nums[j] == nums[k]) {
                
        //         for (int i = j; i < nums.length - 1; i++) {
        //             nums[i] = nums[i + 1];
        //         }
                
        //         k--;
        //     }
        //     j--;
        //     k--;
        // }
    // if(nums[nums.length-1]!= nums[nums.length-2]){
        nums[count] = nums[nums.length-1];
        count++;
    // }
        
        return count;
    }
}
