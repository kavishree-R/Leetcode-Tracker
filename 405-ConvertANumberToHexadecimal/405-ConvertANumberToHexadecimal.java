// Last updated: 7/9/2026, 3:10:20 PM
class Solution {
    public String toHex(int num) {
        if(num==0) return"0";
        char[]map="0123456789abcdef".toCharArray();
        StringBuffer sb=new StringBuffer();
        while(num!=0){
            int d=num&15;
            sb.append(map[d]);
            num>>>=4;
        }       
        return sb.reverse().toString();
    }
}