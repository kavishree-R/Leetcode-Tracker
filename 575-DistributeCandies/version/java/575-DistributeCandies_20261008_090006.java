// Last updated: 10/8/2026, 9:00:06 AM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        HashSet<Integer> set = new HashSet();
4        for(int c : candyType){
5            set.add(c);
6        }
7        return Math.min(candyType.length/2,set.size());
8    }
9}