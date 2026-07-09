// Last updated: 7/9/2026, 3:06:56 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int n = arrivalTime + delayedTime;
         if(n<24){
            return n;
         } 
          else{
            return n%24; 
          } 
        
    }
}
    