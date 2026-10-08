// Last updated: 10/8/2026, 9:17:49 AM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        int cookiesNums = s.length;
4        if(cookiesNums == 0)  return 0;
5        Arrays.sort(g);
6        Arrays.sort(s);
7
8        int maxNum = 0;
9        int cookieIndex = cookiesNums - 1;
10        int childIndex = g.length - 1;
11        while(cookieIndex >= 0 && childIndex >=0){
12            if(s[cookieIndex] >= g[childIndex]){
13                maxNum++;
14                cookieIndex--;
15                childIndex--;
16            }
17            else{
18                childIndex--;
19            }
20        }
21
22        return maxNum;
23    }
24}