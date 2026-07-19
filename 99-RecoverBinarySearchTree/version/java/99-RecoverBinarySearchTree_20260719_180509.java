// Last updated: 7/19/2026, 6:05:09 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        if (root == null)
20            return ans;
21
22        Queue<TreeNode> q = new LinkedList<>();
23        q.offer(root);
24         int levalNo = 0;
25
26        while (!q.isEmpty()) {
27            int size = q.size();
28            List<Integer> level = new ArrayList<>();
29
30            while(size --> 0) {
31                TreeNode curr = q.poll();
32                level.add(curr.val);
33
34                if (curr.left != null) q.offer(curr.left);
35                if (curr.right != null) q.offer(curr.right);
36            }
37            if (levalNo % 2 == 1) Collections.reverse(level);
38            ans.add(level);
39            levalNo++;
40        }
41        return ans;
42    }
43}