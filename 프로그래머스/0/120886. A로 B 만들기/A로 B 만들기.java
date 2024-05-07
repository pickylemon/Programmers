import java.util.*;

class Solution {
    public int solution(String before, String after) {
        List<String> beforeList = new ArrayList<>();
        for(String s : before.split("")){
            beforeList.add(s);
        }
        for(String s : after.split("")){
            beforeList.remove(s);
        }
        
        return beforeList.size() == 0? 1 : 0;
    }
}