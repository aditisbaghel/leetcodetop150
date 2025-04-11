class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = nums.length, sum=0,count=0;
        for(int i=0; i<len; i++)
        {
            if(nums[i]<=threshold && nums[i]%2==0){
                sum=1;
            
            for(int j= i+1 ; j<len ; j++){
                if(nums[j]<=threshold && (nums[j]%2!=nums[j-1]%2)){
                    sum++;
                }
                else{
                break;}
            }
            count=Math.max(count,sum);
            }
        }
        return count;
    }
}