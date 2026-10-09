// Last updated: 10/9/2026, 9:31:52 AM
1class Solution {
2    public String replaceWords(List<String> dictionary, String sentence) {
3        Set<String> dict = new HashSet<>(dictionary);
4        String[] words = sentence.split(" ");
5        StringBuilder result = new StringBuilder();
6        for (String word : words) {
7            if (result.length() > 0) {
8                result.append(" ");
9            }
10            result.append(findRoot(word, dict));
11        }
12        
13        return result.toString();
14    }
15    private String findRoot(String word, Set<String> dict) {
16        for (int i = 1; i <= word.length(); i++) {
17            String prefix = word.substring(0, i);
18            if (dict.contains(prefix)) {
19                return prefix;
20            }
21        }
22        return word; 
23    }
24}