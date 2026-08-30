// Last updated: 8/30/2026, 11:59:08 AM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> ans = new ArrayList<>();
4
5        if (p.length() > s.length()) return ans;
6
7        int[] pFreq = new int[26];
8        int[] window = new int[26];
9
10        for (char c : p.toCharArray()) {
11            pFreq[c - 'a']++;
12        }
13
14        int k = p.length();
15
16        for (int i = 0; i < k; i++) {
17            window[s.charAt(i) - 'a']++;
18        }
19
20        if (Arrays.equals(pFreq, window)) {
21            ans.add(0);
22        }
23
24        for (int i = k; i < s.length(); i++) {
25            window[s.charAt(i) - 'a']++;
26            window[s.charAt(i - k) - 'a']--;
27
28            if (Arrays.equals(pFreq, window)) {
29                ans.add(i - k + 1);
30            }
31        }
32
33        return ans;
34    }
35}