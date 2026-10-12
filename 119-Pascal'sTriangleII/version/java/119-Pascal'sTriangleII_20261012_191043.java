// Last updated: 10/12/2026, 7:10:43 PM
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row = new ArrayList<>();
4
5        int[][] cache = new int[rowIndex + 1][rowIndex + 1];
6
7        for (int i = 0; i <= rowIndex; i++) {
8            row.add(getCell(rowIndex, i, cache));
9        }
10
11        return row;
12    }
13
14    public int getCell(int rowIndex, int cellIndex, int[][] cache) {
15        // check cache
16        if (cache[rowIndex][cellIndex] != 0) return cache[rowIndex][cellIndex];
17        if (rowIndex == 0) return 1;
18        if (cellIndex == 0 || cellIndex == rowIndex) return 1;
19
20        // save in cache
21        cache[rowIndex][cellIndex] = getCell(rowIndex - 1, cellIndex - 1, cache)
22                + getCell(rowIndex - 1, cellIndex, cache);
23
24        return cache[rowIndex][cellIndex];
25    }
26}