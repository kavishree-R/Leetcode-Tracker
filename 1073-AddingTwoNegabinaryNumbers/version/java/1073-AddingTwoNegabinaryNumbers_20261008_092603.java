// Last updated: 10/8/2026, 9:26:03 AM
1class Solution {
2    public int[] addNegabinary(int[] arr1, int[] arr2) {
3        int i = arr1.length - 1, j = arr2.length - 1, carry = 0;
4        Stack<Integer> stack = new Stack<>();
5        while (i >= 0 || j >= 0 || carry != 0) {
6            int v1 = i >= 0 ? arr1[i--] : 0;
7            int v2 = j >= 0 ? arr2[j--] : 0;
8            carry = v1 + v2 + carry;
9            stack.push(carry & 1);
10            carry = -(carry >> 1);
11        }
12        while (!stack.isEmpty() && stack.peek() == 0) stack.pop();
13        int[] res = new int[stack.size()];
14        int index = 0;
15        while (!stack.isEmpty()) {
16            res[index++] = stack.pop();
17        }
18        return res.length == 0 ? new int[1] : res;
19    }
20}