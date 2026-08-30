// Last updated: 8/30/2026, 11:48:59 AM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int start = 0;
4        int end = numbers.length -1;
5        int[] ans = new int[2];
6         while(start != end){
7            if(numbers[start] + numbers[end] == target){
8                ans[0] = start +1;
9                ans[1] = end +1;
10                 return ans;
11            }
12            if(numbers[start] + numbers[end] < target){
13                 start ++;
14            }
15            else {
16                end --;
17            }
18         }
19        return ans;
20    }
21}