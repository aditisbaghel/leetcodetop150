class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        int left =0, right = nums.length-1, mid = (left+right)/2;
        // for(){}
        if(nums[left+1]<nums[left]){
                return left;
            }
            else if(nums[right-1]<nums[right]){
                return right;
            }
        while(left<right){
            
            if(nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid]){
                return mid;
            }
            else if(nums[mid-1]>nums[mid]){
                right=mid;
                mid = (left+right)/2;
            }
            else if(nums[mid+1]>nums[mid]){
                left=mid;
                mid = (left+right)/2;
            }
        }
        return -1;
    }
}

// https://www.youtube.com/watch?v=cXxmbemS6XM