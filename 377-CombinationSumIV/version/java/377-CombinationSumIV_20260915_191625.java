// Last updated: 9/15/2026, 7:16:25 PM
1class Solution {
2    public int findRadius(final int[] houses, final int[] heaters) {
3        Arrays.sort(houses);
4        Arrays.sort(heaters);
5
6        int ans = 0, i = 0;
7        for(final int house : houses) {
8            while(i + 1 < heaters.length && house - heaters[i] > heaters[i + 1] - house)
9                i++;
10            ans = Math.max(ans, Math.abs(heaters[i] - house));
11        }
12
13        return ans;
14    }
15}