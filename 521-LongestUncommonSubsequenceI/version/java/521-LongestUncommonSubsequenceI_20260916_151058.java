// Last updated: 9/16/2026, 3:10:58 PM
1class Solution {
2    public boolean escapeGhosts(int[][] ghosts, int[] target) {
3        int minDist = Integer.MAX_VALUE;
4        int tx = target[0];
5        int ty = target[1];
6
7        for(int[] ghost : ghosts){
8            int x = ghost[0];
9            int y = ghost[1];
10
11
12            int gDist = Math.abs(x - tx) + Math.abs(y - ty);
13            minDist = Math.min(minDist, gDist);
14        }
15
16        int mDist = Math.abs(tx - 0) + Math.abs(ty - 0);
17        
18        if(mDist < minDist){
19            return true;
20        }
21
22        return false;
23    }
24}