class Solution {
    public int waysToMakeFair(int[] nums) {
    int leftOdd=0, leftEven =0, tEven=0, tOdd =0,count=0;
    for(int i =0;i<nums.length; i++){
        if(i%2==0){
            tEven+=nums[i];
        }
        else{
            tOdd+=nums[i];
        }
    }
    for(int i =0;i<nums.length;i++){
        if(i%2==0)
        tEven-=nums[i];
        else
        tOdd-=nums[i];
        if(leftOdd+tEven==leftEven+tOdd){
            count++;
        }
        if(i%2==0)
        leftEven+=nums[i];
        else
        leftOdd+=nums[i];
    }
    return count;
    }
}