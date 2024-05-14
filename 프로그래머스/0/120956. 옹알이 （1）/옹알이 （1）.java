import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        List<String> list = List.of(new String[]{"aya", "ye", "woo", "ma"});
        int cnt = 0;
        for(String s : babbling){
            for(String word : list){
                s = s.replaceAll(word, " ");
            }
            if(s.trim().equals("")) cnt++;
        }
        
        return cnt;
    }
}