// Last updated: 10/9/2026, 10:22:04 AM
1class Solution {
2    public int findMinDifference(List<String> timePoints) {
3        String s;
4       int n=timePoints.size();
5        int[] x=new int[n];
6        for(int i=0;i<n;i++){
7      s=timePoints.get(i);
8           int p=((s.charAt(0)-'0')*10+(s.charAt(1)-'0'))*60;
9            int q=(s.charAt(3)-'0')*10+(s.charAt(4)-'0');
10            x[i]=p+q;
11            }
12       Arrays.sort(x);
13        int c=x[n-1]-x[0];
14        if(c>720)
15            c=1440-c;
16        for(int i=0;i<n-1;i++){
17            int b=x[i+1]-x[i];
18            if(b>720)
19
20            b=1440-b;
21            if(b<c)
22                c=b;
23               }
24        return c;
25    }
26}