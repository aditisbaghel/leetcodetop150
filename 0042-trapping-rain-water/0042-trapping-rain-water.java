class Solution {
    public int trap(int[] height) {
        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];
        int count =0;
        int max =0;
        for(int i=0;i<height.length;i++){
            if(height[i]>max){
                max = height[i];
                leftmax[i]=max;
            }
            else{
                leftmax[i] = max;
            }
      }
      max = 0;
      for(int i=height.length-1;i>=0;i--){
            if(height[i]>max){
                max = height[i];
                rightmax[i]=max;
            }
            else{
                rightmax[i] = max;
            }
      }
      for(int i=0;i<height.length;i++){
        int mini = Math.min(leftmax[i],rightmax[i]);
        count = count + Math.abs(mini - height[i]);
      }   
      return count;
    }
}