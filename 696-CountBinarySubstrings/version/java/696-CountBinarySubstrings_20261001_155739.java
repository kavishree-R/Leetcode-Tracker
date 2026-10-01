// Last updated: 10/1/2026, 3:57:39 PM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int res = 0, prev = 0, strk = 1;
4
5        for (int i = 1; i < s.length(); i++) {
6            if (s.charAt(i) == s.charAt(i - 1)) strk++;
7            else {
8                prev = strk;
9                strk = 1;
10            }
11            if (strk <= prev) res++;
12        }
13        return res;
14    }
15}
16