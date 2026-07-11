// Last updated: 7/11/2026, 3:00:24 PM
1class Solution {
2
3    public boolean isSameTree(TreeNode p, TreeNode q) {
4
5        if (p == null && q == null) {
6            return true;
7        }
8
9        if (p == null && q != null) {
10            return false;
11        }
12
13        if (p != null && q == null) {
14            return false;
15        }
16
17        if (p.val != q.val) {
18            return false;
19        }
20
21        if (isSameTree(p.left, q.left) == false) {
22            return false;
23        }
24
25        if (isSameTree(p.right, q.right) == false) {
26            return false;
27        }
28
29        return true;
30    }
31}