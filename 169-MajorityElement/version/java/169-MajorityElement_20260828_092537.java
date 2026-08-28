// Last updated: 8/28/2026, 9:25:37 AM
1class Solution {
2    public static int majorityElement(int[] nums) {
3        return helper(nums,0,nums[0]);
4    }static int helper(int[] nums, int si, int ref){
5        int c=0;
6        for(int i=si;i<nums.length;i++){
7            if(nums[i]==ref)
8                c++;
9            else
10                c--;
11            if(c==-1)
12                return helper(nums,i,nums[i]);
13        }return ref;
14    }
15    public static void main(String[] args)throws Exception{
16        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
17        String[] s=br.readLine().split(" ");
18        int[] nums=new int[s.length];
19        for(int i=0;i<s.length;i++){
20            nums[i]=Integer.parseInt(s[i]);
21        }majorityElement(nums);
22    }
23}