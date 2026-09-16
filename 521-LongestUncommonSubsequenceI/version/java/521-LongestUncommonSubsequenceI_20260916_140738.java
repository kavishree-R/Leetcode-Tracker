// Last updated: 9/16/2026, 2:07:38 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16public class Solution {
17    public boolean isSubtree(TreeNode s, TreeNode t) {
18        if (s == null) return false;
19        if (isSame(s, t)) return true;
20        return isSubtree(s.left, t) || isSubtree(s.right, t);
21    }
22    
23    private boolean isSame(TreeNode s, TreeNode t) {
24        if (s == null && t == null) return true;
25        if (s == null || t == null) return false;
26        
27        if (s.val != t.val) return false;
28        
29        return isSame(s.left, t.left) && isSame(s.right, t.right);
30    }
31}