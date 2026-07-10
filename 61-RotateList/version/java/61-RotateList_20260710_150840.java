// Last updated: 7/10/2026, 3:08:40 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int Zero=0,one=0,two=0;
4        for(int n:nums){
5            if(n==0) Zero++;
6            else if(n==1) one++;
7            else if(n==1) one++;
8        }
9        for(int i=0;i<nums.length;i++){
10            if(Zero>0){
11                nums[i]=0;
12                Zero--;
13            }else if(one>0){
14                nums[i]=1;
15                one--;
16            }else{
17                nums[i]=2;
18                two--;
19            }
20        }
21    }
22}