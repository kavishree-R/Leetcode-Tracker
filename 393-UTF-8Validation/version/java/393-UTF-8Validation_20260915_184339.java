// Last updated: 9/15/2026, 6:43:39 PM
1class Solution {
2    public boolean validUtf8(int[] data) {
3        int prevN = 0;
4        for (int i : data) {
5            int n = getN(i);
6            if (n > 4) return false;
7
8            //An integer can either represent the start of a UTF-8 character, or a part of an existing UTF-8 character.
9            // There are two separate rules for these two scenarios in the problem.
10            if (n == 1) {
11                //scenario 1: If an integer is a part of an existing UTF-8 character, simply check the 2 most significant bits of in the binary representation string.
12                // They should be 10.  ie. n==1
13                if (prevN <= 0) return false;
14            } else {
15                //scenario 2: If the integer represents the start of a UTF-8 character,
16                // then the first few bits would be 1 followed by a 0. The number of initial bits
17                // (most significant) bits determines the length of the UTF-8 character. ie length  = n
18                if (prevN > 0) return false;
19                // The array can contain multiple valid UTF-8 characters. ie. start of new UTF-8 character
20                prevN = n;
21            }
22            prevN--;
23
24        }
25        if (prevN > 0) return false;
26        return true;
27    }
28
29    public static int getN(int num) {
30        //We can use bit masking to check how many initial bits are set for a given number. 
31        // We only need to work with the 8 least significant bits as mentioned in the problem.
32        int mask = 1 << 7;
33        int count = 0;
34        while ((mask & num) != 0) {
35            count++;
36            mask >>= 1;
37        }
38        return count;
39    }
40}