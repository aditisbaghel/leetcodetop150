
class Solution {
    public boolean increasingTriplet(int[] nums) { 
        if (nums.length < 3)
            return false;
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for(int random: nums){
            if(x>=random)
            {
                x=random;
            }
            else if(y>=random){
                y=random;
            }
            else{
             return true;
            }
        }
        return false;
    }
}
