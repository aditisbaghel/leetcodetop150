class Solution {
    public int jump(int[] nums) {
       int count = 0;
       int max = 0;
       int current =0;
       if(nums.length==1 || nums.length==0){
        return 0;
       }
       for(int i =0; i<nums.length; i++){
            // int random = max;
            max = Math.max(max,i+nums[i]);
            if(i==current){
                current = max;
            count++;}
            // if(max==nums.length-1)
            //     break;
            if (current >= nums.length - 1) {
                    break;
                }
       } 
       return count;
    }
}