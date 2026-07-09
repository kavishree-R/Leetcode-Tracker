// Last updated: 7/9/2026, 3:10:21 PM
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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
        return 0;
      return sumOfLeftLeaves(root.left)+sumOfLeftLeaves (root.right)+helper(root);

    }
    int helper(TreeNode root){
        if(root == null) return 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
        return root.left.val;
       }
       return 0;
    }
}