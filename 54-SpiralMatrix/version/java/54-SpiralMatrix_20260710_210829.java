// Last updated: 7/10/2026, 9:08:29 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int len = 0, i = s.length() - 1;
4        while (i >= 0 && s.charAt(i) == ' ') i--;
5        while (i >= 0 && s.charAt(i) != ' ') {
6            len++;
7            i--;
8        }
9        return len;
10    }
11}