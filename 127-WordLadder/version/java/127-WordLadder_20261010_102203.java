// Last updated: 10/10/2026, 10:22:03 AM
1class Solution {
2    class node{
3        String word;
4        int c ;
5        node(String word , int  c){
6            this.word = word;
7            this.c = c;
8
9        }
10    }
11    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
12
13        HashSet<String> set = new HashSet<>();
14        for(String s : wordList){
15            set.add(s);
16        }
17
18        Queue<node> qu = new LinkedList<>();
19
20        node src = new node(beginWord,1);
21        qu.offer(src);
22        set.remove(beginWord);
23        while(!qu.isEmpty()){
24            node cur = qu.poll();
25            String w = cur.word;
26            int c = cur.c;
27            if(w.equals(endWord)) return c ;
28            
29
30            for(int i = 0 ; i < w.length();i++){
31                for(char k = 'a' ;k <='z'; k ++){
32                    char [] kooo = w.toCharArray();
33                    kooo[i]=k;
34                    String sss = new String(kooo);
35                    if(set.contains(sss)){
36                        qu.add(new node(sss,c+1));
37                        set.remove(sss);
38                    }
39                }
40            }
41             
42        }
43        return 0;
44        
45    }
46}