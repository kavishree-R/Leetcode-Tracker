// Last updated: 8/30/2026, 5:00:48 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        map.put(0,-1);
5        int sum=0;
6        int maxLen=0;
7        for(int i=0;i<nums.length;i++)
8        {
9            if(nums[i]==0)
10            {
11                sum--;
12            }
13            else
14            {
15                sum++;
16            }
17            if(map.containsKey(sum))
18            {
19                maxLen=Math.max(maxLen,i-map.get(sum));
20            }
21            else
22            {
23                map.put(sum,i);
24            }
25        }
26        return maxLen;
27    }
28}