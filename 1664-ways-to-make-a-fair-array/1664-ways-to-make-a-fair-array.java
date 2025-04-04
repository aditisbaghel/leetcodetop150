class Solution {
    public int waysToMakeFair(int[] nums) {
        int oddSum = 0, evenSum=0, count=0;
        int[] oddArray = new int[nums.length];
        int[] evenArray = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(i%2==0){
                evenSum+= nums[i];
            }
            else{
                oddSum+= nums[i];
            }
            oddArray[i] = oddSum;
            evenArray[i] = evenSum;
        }
        for(int i = 0;i<nums.length;i++){
            if(i==0){
                oddSum = evenArray[nums.length-1]-evenArray[0];
                evenSum = oddArray[nums.length-1]-oddArray[0];
            } else if (i == nums.length - 1) {  
                evenSum = evenArray[i - 1];
                oddSum = oddArray[i - 1];
            } 
            else{
            evenSum = evenArray[i-1] + (oddArray[nums.length - 1]-oddArray[i]);
            oddSum = oddArray[i-1] + (evenArray[nums.length - 1]-evenArray[i]);
            }
             if (oddSum == evenSum) {
                count++;
            }
        }
    return count;
    // int leftOdd=0, leftEven =0, tEven=0, tOdd =0,count=0;
    // for(int i =0;i<nums.length; i++){
    //     if(i%2==0){
    //         tEven+=nums[i];
    //     }
    //     else{
    //         tOdd+=nums[i];
    //     }
    // }
    // for(int i =0;i<nums.length;i++){
    //     if(i%2==0)
    //     tEven-=nums[i];
    //     else
    //     tOdd-=nums[i];
    //     if(leftOdd+tEven==leftEven+tOdd){
    //         count++;
    //     }
    //     if(i%2==0)
    //     leftEven+=nums[i];
    //     else
    //     leftOdd+=nums[i];
    // }
    // return count;
    }
}