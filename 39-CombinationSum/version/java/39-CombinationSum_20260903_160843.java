// Last updated: 9/3/2026, 4:08:43 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4         backtrack(candidates, target, 0, new ArrayList<>(), ans);
5        return ans;
6    }
7        
8    
9    void backtrack(int[] candidates ,int target ,int index ,List<Integer> current,
10                            List<List<Integer>> ans ){
11                                if(target==0){
12                                    ans.add(new ArrayList<>(current));
13                                    return ;
14                                }
15                                if(target<0 || index==candidates.length){
16                                    return; 
17                                }
18                                current.add(candidates[index]);
19                                backtrack(candidates, target - candidates[index],
20                  index, current, ans);
21                            current.remove(current.size()-1);
22                            backtrack(candidates,target,index+1,current,ans);
23                            
24                            }
25}