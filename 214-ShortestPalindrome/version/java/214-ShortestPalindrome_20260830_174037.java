// Last updated: 8/30/2026, 5:40:37 PM
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        int subWithMaxK = subarrayWithAtMostK(nums, k);
4        int reducedSubWithMaxK = subarrayWithAtMostK(nums, k - 1);
5        return subWithMaxK - reducedSubWithMaxK;
6    }
7    
8    public int subarrayWithAtMostK(int[] nums, int k) {
9        HashMap<Integer, Integer> map = new HashMap<>();
10        int left = 0, right = 0, ans = 0;
11        
12        while (right < nums.length) {
13            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
14            
15            while (map.size() > k) {
16                map.put(nums[left], map.get(nums[left]) - 1);
17                if (map.get(nums[left]) == 0) {
18                    map.remove(nums[left]);
19                }
20                left++;
21            }
22            
23            ans += right - left + 1; // Size of subarray
24            right++;
25        }
26        
27        return ans;
28    }
29}