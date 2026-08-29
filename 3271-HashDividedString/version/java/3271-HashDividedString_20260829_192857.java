// Last updated: 8/29/2026, 7:28:57 PM
1class Solution {
2    public String stringHash(String s, int k) {
3        int n = s.length();
4        int d = (n/k);
5        StringBuilder str = new StringBuilder();
6        for(int i=0;i<n;i++){
7            int e = k,f = 0;
8            while(e!=0){
9                f += ((int)(s.charAt(i)))%97;
10                e--;
11                i++;
12            }
13            f%=26;
14            f+=97;
15            str.append((char)(f));
16            i--;
17        }
18        return str.toString();
19    }
20}