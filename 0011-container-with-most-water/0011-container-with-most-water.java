class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int count =0,leftP=0,rightP=height.length-1,prev=0,next=height.length-1;
        while(prev<next){
            if(height[prev]>height[leftP]){
                leftP=prev;
            }
            if(height[next]>height[rightP]){
                rightP=next;
            }
            int min = Math.min(height[leftP],height[rightP]);
            min = min*(rightP-leftP);
            if(min>max){
                max = min;
            }
            if(height[leftP]<height[rightP])
            prev++;
            else
            next--;
        }
        return max;
    }
}