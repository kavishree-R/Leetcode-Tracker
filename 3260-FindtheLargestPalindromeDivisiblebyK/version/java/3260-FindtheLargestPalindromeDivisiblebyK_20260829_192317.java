// Last updated: 8/29/2026, 7:23:17 PM
1class Solution {
2    StringBuilder sb = new StringBuilder();
3    public String largestPalindrome(int n, int k) {
4        if (k == 1 || k == 3 || k == 9) {
5            return case139(n);
6        }
7        if (k == 2) {
8            return case2(n);
9        }
10        if (k == 4) {
11            return case4(n);
12        }
13        if (k == 5) {
14            return case5(n);
15        }
16        if (k == 6) {
17            return case6(n);
18        }
19        if (k == 8) {
20            return case8(n);
21        }
22        return case7(n);
23    }
24
25    public String case139(int n) {
26        while (n > 0) {
27            n--;
28            sb.append('9');
29        }
30        return sb.toString();
31    }
32
33    public String case2(int n) {
34        if (n == 1)
35            return "8";
36        if (n == 2)
37            return "88";
38        return "8" + case139(n - 2) + "8";
39    }
40
41    public String case4(int n) {
42        if (n == 1)
43            return "8";
44        if (n == 2)
45            return "88";
46        if (n == 3)
47            return "888";
48        if (n == 4)
49            return "8888";
50        return "88" + case139(n - 4) + "88";
51    }
52
53    public String case8(int n) {
54        if (n <= 6) {
55            while (n > 0) {
56                sb.append("8");
57                n--;
58            }
59            return sb.toString();
60        }
61        return "888" + case139(n - 6) + "888";
62    }
63
64    public String case5(int n) {
65        if (n == 1)
66            return "5";
67        if (n == 2)
68            return "55";
69        return "5" + case139(n - 2) + "5";
70    }
71
72    public String case6(int n) {
73        if (n == 1)
74            return "6";
75        if (n == 2)
76            return "66";
77        String s = case2(n);
78        if (n % 2 == 0) {
79            return s.substring(0, n / 2 - 1) + "77" + s.substring(n / 2 + 1, n);
80        }
81        return s.substring(0, n / 2) + "8" + s.substring(n / 2 + 1, n);
82    }
83
84    public String case7(int n) {
85        if (n == 1)
86            return "7";
87        if (n == 2)
88            return "77";
89        String s = case139(n);
90        if (n % 2 == 0) {
91            for (int i = 9; i >= 0; i--) {
92                s = s.substring(0, n / 2 - 1) + i + "" + i + s.substring(n / 2 + 1, n);
93                int remainder = 0;
94                for (int j = 0; j < n; j++)
95                    remainder = (remainder * 10 + s.charAt(j) - '0') % 7;
96                if (remainder == 0)
97                    return s;
98            }
99            return s;
100        }
101        for (int i = 9; i >= 0; i--) {
102            s = s.substring(0, n / 2) + i + s.substring(n / 2 + 1, n);
103            int remainder = 0;
104            for (int j = 0; j < n; j++)
105                remainder = (remainder * 10 + s.charAt(j) - '0') % 7;
106            if (remainder == 0)
107                return s;
108        }
109        return s;
110    }
111}