import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            String c = s.charAt(i)+"";
            String subBefore = s.substring(i+1);
            String subAfter = s.substring(0,i);
            if(subBefore.indexOf(c) == -1
              && subAfter.indexOf(c) == -1) {
                list.add(c);
            }
        }
        return list.stream().sorted().collect(Collectors.joining());

    }
}