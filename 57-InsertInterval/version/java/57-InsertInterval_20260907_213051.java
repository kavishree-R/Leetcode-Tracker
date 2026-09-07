// Last updated: 9/7/2026, 9:30:51 PM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {   
3        ArrayList<int[]> ans = new ArrayList<>();
4        int idx = 0;
5        while(idx < intervals.length){
6            if(intervals[idx][0] < newInterval[0]){
7                ans.add(intervals[idx]);
8                idx++;
9            }else{
10                break;
11            }
12        }
13        if(ans.size() == 0 || (newInterval[0] > ans.get(ans.size()-1)[1])){
14            ans.add(newInterval);
15        }else{
16            int[] lastInterval = ans.get(ans.size()-1);
17            lastInterval[1] = Math.max(lastInterval[1],newInterval[1]);
18        }
19        while(idx < intervals.length){
20            int[] lastInterval = ans.get(ans.size()-1);
21            if(lastInterval[1] >= intervals[idx][0]){
22                lastInterval[1] = Math.max(lastInterval[1], intervals[idx][1]);
23            }else{
24                ans.add(intervals[idx]);
25            }
26            idx++;
27        }
28        return ans.toArray(new int[ans.size()][]);
29    }
30}