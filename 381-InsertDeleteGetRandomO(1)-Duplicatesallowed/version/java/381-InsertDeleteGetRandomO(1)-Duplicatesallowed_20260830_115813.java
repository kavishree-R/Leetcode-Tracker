// Last updated: 8/30/2026, 11:58:13 AM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        ArrayList<Integer> ans = new ArrayList<>();
5
6        for (int num : nums) {
7            if (set.contains(num)) {
8                ans.add(num);
9            } else {
10                set.add(num);
11            }
12        }
13
14        return ans;
15    }
16}