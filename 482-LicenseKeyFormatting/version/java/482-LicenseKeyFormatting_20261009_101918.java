// Last updated: 10/9/2026, 10:19:18 AM
1class Solution {
2    public String licenseKeyFormatting(String str, int k) {
3        String temp="",ans="";
4        
5        //
6        for(int i=str.length()-1;i>=0;i--)
7        {
8            char ch=str.charAt(i);
9            if(ch!='-')
10                temp=temp+Character.toUpperCase(ch);
11        }
12
13        int c=k;
14        for(int i=0;i<temp.length();i++)
15        {
16            char ch=temp.charAt(i);
17            if(c==0)
18            {
19                c=k;
20                ans='-'+ans;
21            }
22            ans=ch+ans;
23            c--;
24        }
25
26        return ans;
27
28
29
30
31    }
32}