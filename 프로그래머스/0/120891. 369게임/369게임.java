import java.util.*;

class Solution {
    public int solution(int order) {
        int clap = 0;

        while(order > 0) {
            int rest = order % 10;
            if(rest == 3 || rest == 6 || rest == 9) clap++;
            order /= 10;
        }
        
        return clap;
    }
}