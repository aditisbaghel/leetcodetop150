/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode compareLeftRight(int[] nums, int left, int right){
        if(left>right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left = compareLeftRight(nums,left,mid-1);
        midNode.right = compareLeftRight(nums,mid+1,right);
        return midNode;
        }
    public TreeNode sortedArrayToBST(int[] nums) {
    return compareLeftRight(nums,0,nums.length-1);
    }
}