// Last updated: 10/12/2026, 7:08:13 PM
1class Solution {
2    public int[] constructRectangle(int area) {
3
4        int width = (int) Math.sqrt(area);
5
6        while (area % width != 0) {
7            width--;
8        }
9
10        return new int[] { area / width, width };
11    }
12}