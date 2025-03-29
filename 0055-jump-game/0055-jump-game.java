class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1)
            return true;
        if(nums.length==2)
            return nums[0]!=0;
        int req =nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>req-i-1){
                    req = i;
            }
            if(req==0 && nums[0]!=0){
                return true;
            }

        }
        return false;
    }
}