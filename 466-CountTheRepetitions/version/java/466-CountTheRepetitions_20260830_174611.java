// Last updated: 8/30/2026, 5:46:11 PM
1class Solution {
2    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
3        int l1 = s1.length(), l2 = s2.length();
4        int[] nxt = new int[l2+1], cnt = new int[l2+1];
5        int count = 0, p = 0;
6        for(int i=0;i<n1;i++){
7            for(int j=0;j<l1;j++){
8                if(s1.charAt(j)==s2.charAt(p)){
9                    p++;
10                }
11                if(p==l2){
12                    count++;
13                    p=0;
14                }
15            }
16            cnt[i] = count;
17            nxt[i] = p;
18            for(int j=0;j<i;j++){
19                if(nxt[j]==p){
20                    int prevCnt = cnt[j];
21                    int patternCnt = (cnt[i]-cnt[j])*((n1-j-1)/(i-j));
22                    int remainCnt = cnt[j+(n1-j-1)%(i-j)]-cnt[j];
23                    return (prevCnt+patternCnt+remainCnt)/n2;
24                }
25            }
26        }
27        return cnt[n1-1]/n2;
28    }
29}