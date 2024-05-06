import java.util.*;

class Solution {
    public int solution(int order) {
        int clap = 0;
        Integer[] numArr = {3, 6, 9};
        List<Integer> list = List.of(numArr);
        while(order > 0) {
            int rest = order % 10;
            if(list.contains(rest)) clap++;
            order /= 10;
        }
        
        return clap;
    }
}