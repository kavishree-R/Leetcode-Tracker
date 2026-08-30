// Last updated: 8/30/2026, 11:46:11 AM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3
4        Stack<Integer> stack = new Stack<>();
5
6        for (int i = 0; i < asteroids.length; i++) {
7            while (!stack.isEmpty()
8                    && stack.peek() > 0
9                    && asteroids[i] < 0) {
10
11                int top = stack.peek();
12
13                int collide = top + asteroids[i];
14
15                if (collide < 0) {
16                    stack.pop();
17
18                   
19                }
20
21                else if (collide > 0) {
22
23                    asteroids[i] = 0;
24
25                    break;
26                }
27
28                else {
29
30                    asteroids[i] = 0;
31
32                    stack.pop();
33
34                    break;
35                }
36            }
37
38            if (asteroids[i] != 0) {
39                stack.push(asteroids[i]);
40            }
41        }
42
43        int[] ans = new int[stack.size()];
44
45        for (int i = stack.size() - 1; i >= 0; i--) {
46            ans[i] = stack.pop();
47        }
48
49        return ans;
50    }
51}