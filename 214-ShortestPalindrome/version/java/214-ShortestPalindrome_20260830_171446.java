// Last updated: 8/30/2026, 5:14:46 PM
1class Solution {
2    public String shortestPalindrome(String s) {
3        String rev = new StringBuilder(s).reverse().toString();
4        String temp = s + "#" + rev;
5
6        int[] lps = new int[temp.length()];
7
8        // Build LPS array
9        for (int i = 1; i < temp.length(); i++) {
10            int j = lps[i - 1];
11
12            while (j > 0 && temp.charAt(i) != temp.charAt(j)) {
13                j = lps[j - 1];
14            }
15
16            if (temp.charAt(i) == temp.charAt(j)) {
17                j++;
18            }
19
20            lps[i] = j;
21        }
22
23        int palindromeLength = lps[temp.length() - 1];
24
25        String suffix = s.substring(palindromeLength);
26        String prefix = new StringBuilder(suffix).reverse().toString();
27
28        return prefix + s;
29    }
30}