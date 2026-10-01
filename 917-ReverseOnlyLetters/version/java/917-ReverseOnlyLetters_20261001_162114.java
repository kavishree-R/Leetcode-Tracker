// Last updated: 10/1/2026, 4:21:14 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        int i=0;
4        int j=s.length()-1;
5        char[] c=s.toCharArray();
6        while(i<j){
7            if(!Character.isLetter(c[i])){
8                i++;
9                continue;
10            }
11            if(!Character.isLetter(c[j])){
12                j--;
13                continue;
14            }
15            char t=c[i];
16            c[i]=c[j];
17            c[j]=t;
18            i++;
19            j--;
20        }
21        return new String(c);
22    }
23}