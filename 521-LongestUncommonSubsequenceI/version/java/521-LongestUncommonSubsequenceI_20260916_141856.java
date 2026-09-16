// Last updated: 9/16/2026, 2:18:56 PM
1class Solution {
2    public int distance(int a[], int b[]){
3        int x = b[0]-a[0];
4        int y = b[1]-a[1];
5        int s = (x*x) + (y*y);
6        return s;
7
8    }
9    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
10        int d[] = new int[6];
11        d[0] = distance(p1,p2);
12        d[1] = distance(p2,p3); 
13        d[2] = distance(p3,p4);
14        d[3] = distance(p4,p1);
15        d[4] = distance(p1,p3);
16        d[5] = distance(p2,p4);
17        Arrays.sort(d);
18        return d[0]>0&&d[0]==d[1]&&d[1]==d[2]&&d[2]==d[3]&&d[4]==d[5];
19        
20    }
21}