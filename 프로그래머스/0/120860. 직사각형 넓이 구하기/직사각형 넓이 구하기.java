import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        
        int y2 = 0;
        int x3 = 0;
        for(int i=1; i<4; i++){
            if(dots[i][0] == x1) {
                y2 = dots[i][1];
            } 
            if(dots[i][1] == y1) {
                x3 = dots[i][0];
            }
        }
        
        return Math.abs((y1-y2) * (x1-x3));
    }
}