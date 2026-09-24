// Last updated: 9/24/2026, 6:37:45 PM
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int poision=duration;
4        for(int i=1;i<timeSeries.length;i++){
5            if(timeSeries[i-1]+duration>timeSeries[i]){
6                poision=poision+timeSeries[i]-timeSeries[i-1];
7            }else {
8                poision+=duration;
9            }}
10        return poision;
11    }
12}