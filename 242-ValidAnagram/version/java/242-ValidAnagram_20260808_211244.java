// Last updated: 8/8/2026, 9:12:44 PM
1class Solution {
2    int idx; // this index traverse the string in one pass, between different level of recursion
3    public int calculate(String s) {
4        idx = 0; // Initialization should be here
5        return calc(s);
6    }
7    
8    private int calc(String s) {
9        int res = 0, num = 0, sign = 1;
10        while (idx < s.length()) {
11            char c = s.charAt(idx++);
12            if (c >= '0' && c <= '9') num = num * 10 + c - '0';
13            else if (c == '(') num = calc(s); // ( is start of a new sub-problem, Let recursion solve the sub-problem
14            else if (c == ')') return res + sign * num;
15            else if (c == '+' || c == '-') { // only when we meet a new sign, we know a while number has been read
16                res += sign * num;
17                num = 0;
18                sign = c == '-' ? -1 : 1;
19            }
20        }
21        return res + sign * num; // last number is not processed yet
22    }
23}