// Last updated: 10/1/2026, 3:53:38 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3        char [] arr= s.toCharArray();
4        for(int i=0;i<arr.length;i+=2*k){
5            int l= i;
6            int r= Math.min(i+k-1,arr.length-1);
7            while(l<r){
8                char temp= arr[l];
9                arr[l]= arr[r];
10                arr[r]= temp;
11                l++;
12                r--;
13            }
14        }
15        return new String(arr);
16    }
17}