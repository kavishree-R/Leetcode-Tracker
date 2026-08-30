// Last updated: 8/30/2026, 5:03:32 PM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for (int i = 0, remainder = 0; i < nums.length; i++) {
5            remainder = ((remainder + nums[i]) % k + k) % k;
6            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
7        }
8        int result = map.getOrDefault(0, 0);
9        for (int frequency : map.values())
10            result += frequency * (frequency - 1) / 2;
11        return result;
12    }
13}