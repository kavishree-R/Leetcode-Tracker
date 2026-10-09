// Last updated: 10/9/2026, 10:05:17 AM
1class Solution {
2    int data[];
3    public Solution(int[] nums) {
4        data = new int[nums.length];
5
6        for(int i=0;i<nums.length;i++)  data[i] = nums[i];
7    }
8    
9    public int[] reset() {
10        return data;
11    }
12    
13    int Random(){
14        Random rand = new Random();
15
16        return rand.nextInt(data.length);
17    }
18
19    public int[] shuffle() {
20        
21        int[] ans = new int[data.length];
22        boolean added[] = new boolean[data.length];
23
24        for(int i=0;i<ans.length;i++){
25            int index = Random();
26            if(!added[index]){
27                added[index] = true;
28                ans[i] = data[index];
29            }
30            else i--;
31
32        }    
33        return ans;
34        // return data;
35    }
36}
37
38/**
39 * Your Solution object will be instantiated and called as such:
40 * Solution obj = new Solution(nums);
41 * int[] param_1 = obj.reset();
42 * int[] param_2 = obj.shuffle();
43 */