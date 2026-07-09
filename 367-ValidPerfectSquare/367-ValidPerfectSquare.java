// Last updated: 7/9/2026, 3:10:29 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        long Left=1;
        long Right=num;
        while(Left<=Right){
            long mid=(Left+Right)/2;
            long s=mid*mid;
            if(s==num){
                return true;
            }
            else if(s<num){
                Left=mid+1;
            }
            else{
                Right=mid-1;
            }
        }
        return false;
    }
}