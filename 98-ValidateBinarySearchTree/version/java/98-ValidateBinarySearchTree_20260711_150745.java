// Last updated: 7/11/2026, 3:07:45 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> triangle = new ArrayList<>();
4        for(int i = 1; i <= numRows; i++){
5            triangle.add(entireRow(i, i-1));
6        }
7        return triangle;
8    }
9    public List<Integer> entireRow(int row, int col){
10        List<Integer> column = new ArrayList<>();
11        int ans = 1;
12        column.add(ans);
13        for(int i = 1; i <= col; i++){
14            ans = ans * (row - i); 
15            ans = ans/i;
16            column.add(ans);
17        }
18        return column;
19    }
20}