class Solution {
    public void sortColors(int[] nums) {
        int left=0, right=nums.length-1,temp,cur=0;
        while(cur<=right){
            if(nums[cur]==0){
               temp =nums[left];
               nums[left]=nums[cur];
               nums[cur]=temp;
               left++;
               }
               else if(nums[cur]==2){
                temp =nums[cur];
               nums[cur]=nums[right];
               nums[right]=temp;
               right--;
               }
            cur++;
            
        }
    }
}