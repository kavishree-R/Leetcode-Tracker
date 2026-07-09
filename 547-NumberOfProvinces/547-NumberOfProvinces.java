// Last updated: 7/9/2026, 3:10:06 PM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> adj=new ArrayList<>();
        boolean[] visited=new boolean[n];
        int count =0;
        for(int i=0;i<n;i++){
            if(visited[i]!=true){
                dfs(i,visited,isConnected,n);
                count++;
            }
        }
        return count;
    }
    void dfs(int node,boolean[] visited,int[][] isConnected,int n) {
        visited[node]=true;
        for(int i=0;i<n;i++){
            if(isConnected[node][i]==1 && !visited[i]){
                dfs(i,visited,isConnected,n);

            }
        }
    }
}