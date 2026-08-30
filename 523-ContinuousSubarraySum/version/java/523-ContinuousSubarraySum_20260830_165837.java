// Last updated: 8/30/2026, 4:58:37 PM
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3/* int pro = nums[0];
4        int i = 0, j = 1;
5        while (j < nums.length) {
6            if(pro<k){
7                pro *= nums[j];
8                j++;
9            }
10           else if (pro % k > 0) {
11                pro /= nums[i];
12                i++;
13            } else if (pro % k == 0 && j - i >= 1) {
14                return true;
15            }
16        }
17        return false;
18        */
19         Map<Integer, Integer> remainderIndexMap = new HashMap<>();
20        remainderIndexMap.put(0, -1); // To handle the case where the subarray starts from index 0
21        int sum = 0;
22
23        for (int i = 0; i < nums.length; i++) {
24            sum += nums[i];
25            int remainder = sum % k;
26
27            if (remainderIndexMap.containsKey(remainder)) {
28                if (i - remainderIndexMap.get(remainder) > 1) {
29                    return true;
30                }
31            } else {
32                remainderIndexMap.put(remainder, i);
33            }
34        }
35
36        return false;
37    }
38}