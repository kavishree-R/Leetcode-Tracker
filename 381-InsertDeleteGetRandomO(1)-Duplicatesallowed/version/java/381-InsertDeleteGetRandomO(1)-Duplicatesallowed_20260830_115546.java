// Last updated: 8/30/2026, 11:55:46 AM
1class Solution {
2    List<String> result=new ArrayList<>();
3    public List<String> restoreIpAddresses(String s) {
4        if(s.length()<4||s.length()>12) return result;
5        helper(s,0,0,new StringBuilder ());
6        return result;
7    }
8    public void helper(String s,int startIdx,int count,StringBuilder sb){
9        if(count==4){
10            if(startIdx==s.length()){
11                result.add(sb.toString());
12                
13            }
14            return;
15        }
16        for(int len=1;len<=3;len++){
17            if(startIdx+len>s.length()) break;
18            String str=s.substring(startIdx,startIdx+len);
19            if(isValid(str)){
20                int prevlength=sb.length();
21                sb.append(str);
22                if(count<3) sb.append(".");
23                helper(s,startIdx+len,count+1,sb);
24                sb.setLength(prevlength);
25            }
26        }
27    }
28    public boolean isValid(String str){
29        if(str.charAt(0)=='0'&&str.length()>1) return false;
30        int value=Integer.parseInt(str);
31        return value>=0&&value<=255;
32    }
33}