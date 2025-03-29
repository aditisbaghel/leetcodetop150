

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    ArrayList<Integer> arr = new ArrayList<>();
        int i=0, j=0;
        while(i<m && j<n){

            if(nums1[i]<= nums2[j] ){
                arr.add(nums1[i]);
                i++;
            }
            else if(nums1[i]>= nums2[j] ){
                arr.add(nums2[j]);
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        while(i<m){
            // if(nums1[i]!=0)
            arr.add(nums1[i]);
            i++;
        }
        while(j<n){
            // if(nums2[j]!=0)
            arr.add(nums2[j]);
            j++;
        }
        i=0;
        for(Integer arr2 : arr){
        System.out.println(arr2);
        nums1[i] = arr2;
        i++;
    }
    }
    
}
