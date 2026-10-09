// Last updated: 10/9/2026, 10:15:28 AM
1class Solution {
2    public int integerReplacement(int n) {
3        long temp = n ;
4        int c = 0;
5        while(temp !=1){
6            if(temp%2==0){
7                temp/=2;
8            }
9            else if(temp==3 || temp%4==1){
10                temp -=1;
11            }
12            else{
13                temp+=1;
14            }
15            c++;
16        }
17        return c;
18    }
19}