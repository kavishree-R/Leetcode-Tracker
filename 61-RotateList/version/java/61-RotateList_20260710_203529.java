// Last updated: 7/10/2026, 8:35:29 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0 , right = nums.length-1;
4
5        while ( left <= right) {
6            int mid = (left + right) / 2;
7
8            if ( nums[mid]== target) return true;
9
10            if ( nums[left] == nums[mid]){
11                left ++;
12                continue;
13            }
14
15            if ( nums[left] <= nums [mid]){
16                if ( target >= nums[left] && target<=nums[mid]){
17                    right = mid -1 ;
18                }else {
19                    left = mid + 1;
20                }
21
22            }else {
23                if ( target>nums[mid] && target <= nums[right]){
24                    left = mid + 1;
25                }else{
26                    right= mid -1 ;
27                }
28            }
29        }
30
31        return false;
32        
33        
34    }
35}