// Last updated: 9/16/2026, 2:00:22 PM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        
4        boolean[] isJewels = new boolean[128];
5
6        for(char ch: jewels.toCharArray()) {
7            isJewels[ch] = true;
8        }
9
10        int count = 0;
11        for(char ch : stones.toCharArray()) {
12            if(isJewels[ch]) {
13                count++;
14            }
15        }
16        return count;
17    }
18}