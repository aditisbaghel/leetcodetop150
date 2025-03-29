class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total=nums1.length+nums2.length-1, index1 =0,index2=0;
        ArrayList<Integer> merged = new ArrayList<Integer>();
    while(total>=0 ){
        if(index1<nums1.length && index2<nums2.length && nums1[index1]<nums2[index2]){
            merged.add(nums1[index1]);
            index1++;
        }
        else if(index1<nums1.length && index2<nums2.length && nums1[index1]>nums2[index2]){
            merged.add(nums2[index2]);
            index2++;
        }
        else if(index1<nums1.length){
            merged.add(nums1[index1]);
            index1++;
        }
        else if(index2<nums2.length){
            merged.add(nums2[index2]);
            index2++;
        }
        total--;
    }
    total = nums1.length+nums2.length;
    double result =0.0d;
    if(total%2==0){
        return (merged.get(total/2)*1.0+merged.get((total/2)-1)*1.0)/2.0;
    }
    else{
        return merged.get(total/2)*1.0;
    }
    }
}