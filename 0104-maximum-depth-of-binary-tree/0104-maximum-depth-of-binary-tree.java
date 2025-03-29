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
    // int max = Integer.MIN_VALUE,count =0;
    public int maxDepth(TreeNode root) {
        // count++;
        if(root==null){
            // System.out.println(root);
            // count=0;
            return 0;
        }
        // System.out.println(root.val);
        
        
        // count=0;
        
        // count
        
        // if(count>max){max=count;}
        // count=0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

}