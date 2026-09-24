// Last updated: 9/24/2026, 6:05:33 PM
1public class Solution {
2    private Map<Integer, List<Integer>> indices = new HashMap<>();
3
4    public Solution(int[] nums) {
5        for (int i = 0; i < nums.length; i++) {
6            if (!indices.containsKey(nums[i])) {
7                indices.put(nums[i], new ArrayList<>());
8            }
9            indices.get(nums[i]).add(i);
10        }
11    }
12
13    public int pick(int target) {
14        Random random = new Random();
15
16        if (indices.containsKey(target)) {
17            List<Integer> targetIndices = indices.get(target);
18            int randomIndex = random.nextInt(targetIndices.size());
19            return targetIndices.get(randomIndex);
20        }
21
22        return -1;
23    }
24}
25
26/**
27 * Your Solution object will be instantiated and called as such:
28 * Solution obj = new Solution(nums);
29 * int param_1 = obj.pick(target);
30 */