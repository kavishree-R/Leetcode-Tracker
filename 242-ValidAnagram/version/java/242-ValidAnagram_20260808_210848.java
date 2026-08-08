// Last updated: 8/8/2026, 9:08:48 PM
1public class Solution {
2public int calculate(String s) {
3    int len;
4    if(s==null || (len = s.length())==0) return 0;
5    Stack<Integer> stack = new Stack<Integer>();
6    int num = 0;
7    char sign = '+';
8    for(int i=0;i<len;i++){
9        if(Character.isDigit(s.charAt(i))){
10            num = num*10+s.charAt(i)-'0';
11        }
12        if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
13            if(sign=='-'){
14                stack.push(-num);
15            }
16            if(sign=='+'){
17                stack.push(num);
18            }
19            if(sign=='*'){
20                stack.push(stack.pop()*num);
21            }
22            if(sign=='/'){
23                stack.push(stack.pop()/num);
24            }
25            sign = s.charAt(i);
26            num = 0;
27        }
28    }
29
30    int re = 0;
31    for(int i:stack){
32        re += i;
33    }
34    return re;
35 }
36}