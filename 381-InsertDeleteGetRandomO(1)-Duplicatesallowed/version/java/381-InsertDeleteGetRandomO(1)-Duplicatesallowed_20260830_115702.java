// Last updated: 8/30/2026, 11:57:02 AM
1public class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int sum = 0, result = 0;
4        Map<Integer, Integer> preSum = new HashMap<>();
5        preSum.put(0, 1);
6        
7        for (int i = 0; i < nums.length; i++) {
8            sum += nums[i];
9            if (preSum.containsKey(sum - k)) {
10                result += preSum.get(sum - k);
11            }
12            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
13        }
14        
15        return result;
16    }
17}