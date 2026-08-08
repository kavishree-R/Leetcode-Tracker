// Last updated: 8/8/2026, 9:05:38 PM
1public class Solution {
2    public List<Integer> diffWaysToCompute(String input) {
3        List<Integer> ret = new LinkedList<Integer>();
4        for (int i=0; i<input.length(); i++) {
5            if (input.charAt(i) == '-' ||
6                input.charAt(i) == '*' ||
7                input.charAt(i) == '+' ) {
8                String part1 = input.substring(0, i);
9                String part2 = input.substring(i+1);
10                List<Integer> part1Ret = diffWaysToCompute(part1);
11                List<Integer> part2Ret = diffWaysToCompute(part2);
12                for (Integer p1 :   part1Ret) {
13                    for (Integer p2 :   part2Ret) {
14                        int c = 0;
15                        switch (input.charAt(i)) {
16                            case '+': c = p1+p2;
17                                break;
18                            case '-': c = p1-p2;
19                                break;
20                            case '*': c = p1*p2;
21                                break;
22                        }
23                        ret.add(c);
24                    }
25                }
26            }
27        }
28        if (ret.size() == 0) {
29            ret.add(Integer.valueOf(input));
30        }
31        return ret;
32    }
33}