// Last updated: 8/22/2026, 4:20:25 PM
1public class Solution {
2     public String largestNumber(int[] num) {
3		if(num == null || num.length == 0)
4		    return "";
5		
6		String[] s_num = new String[num.length];
7		for(int i = 0; i < num.length; i++)
8		    s_num[i] = String.valueOf(num[i]);
9			
10		Comparator<String> comp = new Comparator<String>(){
11		    @Override
12		    public int compare(String str1, String str2){
13		        String s1 = str1 + str2;
14				String s2 = str2 + str1;
15				return s2.compareTo(s1); // reverse order here, so we can do append() later
16		    }
17	     };
18		
19		Arrays.sort(s_num, comp);
20		if(s_num[0].charAt(0) == '0')
21			return "0";
22            
23		StringBuilder sb = new StringBuilder();
24		for(String s: s_num)
25	        sb.append(s);
26		
27		return sb.toString();
28		
29	}
30}