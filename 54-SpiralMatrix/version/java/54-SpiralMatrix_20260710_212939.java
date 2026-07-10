// Last updated: 7/10/2026, 9:29:39 PM
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
17    public static List<TreeNode> generateTrees(int n) {
18    List<TreeNode>[] result = new List[n + 1];
19    result[0] = new ArrayList<TreeNode>();
20    if (n == 0) {
21        return result[0];
22    }
23
24    result[0].add(null);
25    for (int len = 1; len <= n; len++) {
26        result[len] = new ArrayList<TreeNode>();
27        for (int j = 0; j < len; j++) {
28            for (TreeNode nodeL : result[j]) {
29                for (TreeNode nodeR : result[len - j - 1]) {
30                    TreeNode node = new TreeNode(j + 1);
31                    node.left = nodeL;
32                    node.right = clone(nodeR, j + 1);
33                    result[len].add(node);
34                }
35            }
36        }
37    }
38    return result[n];
39}
40
41private static TreeNode clone(TreeNode n, int offset) {
42    if (n == null) {
43        return null;
44    }
45    TreeNode node = new TreeNode(n.val + offset);
46    node.left = clone(n.left, offset);
47    node.right = clone(n.right, offset);
48    return node;
49}
50}