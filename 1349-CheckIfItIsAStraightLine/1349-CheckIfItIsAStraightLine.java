// Last updated: 7/9/2026, 3:09:04 PM
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x=coordinates[0][0];
        int y=coordinates[0][1];
        int x1=coordinates[1][0];
        int y1=coordinates[1][1];
        for(int i=2;i<coordinates.length;i++){
            int x2=coordinates[i][0];
            int y2=coordinates[i][1];
            if(((x-x1)*(y2-y1))!=((y-y1)*(x2-x1))) return false;
        }
            return true;
    }
}