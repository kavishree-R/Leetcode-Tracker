// Last updated: 7/10/2026, 9:43:28 PM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int count=0;
4        while(x!=0||y!=0){
5            if((x&1)!=(y&1)){
6                count++;
7            }
8            x=x>>1;
9            y=y>>1;
10        }
11    
12    return count;
13    }
14}