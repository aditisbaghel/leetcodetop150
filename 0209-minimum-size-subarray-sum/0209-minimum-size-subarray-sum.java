class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int leftL=0;
        int rightL=0;
        int totalSum=0;
        int minCount=Integer.MAX_VALUE;
        while(rightL<nums.length){
            totalSum+=nums[rightL];
            rightL++;
            // minCount++;
            while(totalSum>=target){
            minCount = Math.min(minCount,rightL-leftL);
            totalSum-=nums[leftL];
            leftL++;
            }
            // while(totalSum<target){
            //    totalSum+=totalSum+nums[rightL];
            //    rightL=+1;
            //    minCount++; 
            // }
            // leftL++;
            // in
            // if()
            // for(int i = leftL;i<right){}

        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }
}