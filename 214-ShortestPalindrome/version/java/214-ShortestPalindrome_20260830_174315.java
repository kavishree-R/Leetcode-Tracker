// Last updated: 8/30/2026, 5:43:15 PM
1public class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3        List<String> res = new ArrayList<>();
4        List<String> curWords = new ArrayList<>();
5        int curLen = 0;
6
7        for (String word : words) {
8            if (curLen + word.length() + curWords.size() > maxWidth) {
9                int totalSpaces = maxWidth - curLen;
10                int gaps = curWords.size() - 1;
11                if (gaps == 0) {
12                    res.add(curWords.get(0) + " ".repeat(totalSpaces));
13                } else {
14                    int spacePerGap = totalSpaces / gaps;
15                    int extraSpaces = totalSpaces % gaps;
16                    StringBuilder line = new StringBuilder();
17                    for (int i = 0; i < curWords.size(); i++) {
18                        line.append(curWords.get(i));
19                        if (i < gaps) {
20                            line.append(" ".repeat(spacePerGap));
21                            if (i < extraSpaces) {
22                                line.append(' ');
23                            }
24                        }
25                    }
26                    res.add(line.toString());
27                }
28                curWords.clear();
29                curLen = 0;
30            }
31            curWords.add(word);
32            curLen += word.length();
33        }
34
35        StringBuilder lastLine = new StringBuilder(String.join(" ", curWords));
36        while (lastLine.length() < maxWidth) {
37            lastLine.append(' ');
38        }
39        res.add(lastLine.toString());
40
41        return res;
42    }
43}