// Last updated: 9/9/2026, 10:03:40 AM
1class Solution {
2    public String countAndSay(int n) {
3        String curr = "1";
4        if(n==1) return curr;
5        for(int i=2;i<=n;i++)
6        {
7            StringBuilder sb = new StringBuilder();
8            int cnt = 1;
9            char ele = curr.charAt(0);
10            for(int j=1;j<curr.length();j++)
11            {
12                char currChar = curr.charAt(j);
13                if(currChar == ele) 
14                cnt++;
15                else{
16                    sb.append(cnt).append(ele);
17                    ele = currChar;
18                    cnt=1;
19                }
20            }
21            sb.append(cnt).append(ele);
22            curr = sb.toString();
23        }
24        return curr;
25    }
26}