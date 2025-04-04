class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);  // Sort the array first
        // List<List<Integer>> ll = new ArrayList<>();
 int diff = Integer.MAX_VALUE;
 int curSum =0;
            int result=0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;  // Left pointer
            int right = nums.length - 1;  // Right pointer
            // int reqSum = 0 - nums[i];  // The sum we need for the pair of `left` and `right`
           
            while (left < right) {
                 curSum = nums[left] + nums[right] + nums[i];  // Current sum of the pair

                if (curSum == target) {  // Found a valid triplet
                   return target;
            }
            else if(Math.abs(target-curSum)< Math.abs(diff)){
                diff = target-curSum;
                result = curSum;
            }
            // left++;
            // right--;

            // while(left<right && nums[left]==nums[left-1]){
            //     left++;
            // }
            if(curSum<target)
             left++;
            else
            right--;
        }

        // return ll; 
    }
    return result;
}}