// Last updated: 7/19/2026, 6:07:09 PM
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
16class Solution {
17     private int i = 0;
18    private int p = 0;
19    public TreeNode buildTree(int[] preorder, int[] inorder) {
20        return build(preorder, inorder, Integer.MIN_VALUE);
21    }
22
23    private TreeNode build(int[] preorder, int[] inorder, int stop) {
24        if (p >= preorder.length) {
25            return null;
26        }
27        if (inorder[i] == stop) {
28            ++i;
29            return null;
30        }
31
32        TreeNode node = new TreeNode(preorder[p++]);
33        node.left = build(preorder, inorder, node.val);
34        node.right = build(preorder, inorder, stop);
35        return node;
36    }
37}