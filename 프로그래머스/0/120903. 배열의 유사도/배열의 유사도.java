import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        List list = Arrays.asList(s1);
        int cnt = 0;
        for(String s : s2){
            if(list.contains(s)) {
                cnt++;
            }
        }
        
        return cnt;
    }
}