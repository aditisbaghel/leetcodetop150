class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, n=nums.length;
        for(int i=1; i<n; i++){
            nums[i]+=nums[i-1];
        }
     for(int i=0; i<n; i++){
            int leftSum = i>0?nums[i-1]:0;
            int rightSum = i<(n-1)?(nums[n-1]-nums[i]):0;
            if(leftSum==rightSum)
              return i;
        }
        return -1;
    }
}