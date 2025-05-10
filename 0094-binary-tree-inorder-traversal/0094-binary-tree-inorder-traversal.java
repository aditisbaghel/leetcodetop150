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

//  left root right
class Solution {
    private List<Integer> ll = new LinkedList<>();
    private void inOrderTraverse(TreeNode root){
        if(root==null)
        return;
        inOrderTraverse(root.left);
        ll.add(root.val);
        inOrderTraverse(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
     inOrderTraverse(root);
     return ll;
    }
}