// Last updated: 9/1/2026, 3:58:22 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int n = s.length();
4        int m = p.length();
5        int[][] dp = new int[n+1][m+1];
6
7        for(int i=0;i<=n;i++) Arrays.fill(dp[i], -1);
8
9        return helper(n, m, s, p, dp);
10    }
11
12    private boolean helper(int i, int j, String s, String p, int[][] dp){
13        if(i==0 && j==0) return true;
14        if(i>0 && j==0) return false;
15        if(i==0 && j>0) return check(j, p);
16
17        if(dp[i][j] != -1) return dp[i][j]==1;
18        boolean ans = false;
19
20        if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
21            ans = helper(i-1, j-1, s, p, dp);
22        }
23        else if(p.charAt(j-1) == '*'){
24            ans = helper(i, j-1, s, p, dp) || helper(i-1, j, s, p, dp);
25        }
26
27        dp[i][j] = ans ? 1 : 0;
28
29        return ans;
30    }
31
32    private boolean check(int j, String p){
33        for(int i=0;i<j;i++){
34            if(p.charAt(i) != '*') return false;
35        }
36
37        return true;
38    }
39}