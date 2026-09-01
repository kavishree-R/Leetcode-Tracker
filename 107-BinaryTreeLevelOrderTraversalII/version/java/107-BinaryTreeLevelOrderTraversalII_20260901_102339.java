// Last updated: 9/1/2026, 10:23:39 AM
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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18        if(root==null)return new ArrayList<>();
19        Queue<TreeNode> q=new ArrayDeque<>();
20        List<List<Integer>> ans=new ArrayList<>();
21
22        q.offer(root);
23
24        while(!q.isEmpty()){
25            int size=q.size();
26            List<Integer> list=new ArrayList<>();
27
28            while(size>0){
29                TreeNode temp=q.poll();
30                list.add(temp.val);
31                if(temp.left!=null)q.offer(temp.left);
32                if(temp.right!=null)q.offer(temp.right);
33                size--;
34            }
35            ans.add(list);
36        }
37
38        Collections.reverse(ans);
39        return ans;
40    }
41}