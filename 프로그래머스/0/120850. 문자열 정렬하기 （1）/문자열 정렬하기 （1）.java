import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for(char c : my_string.toCharArray()){
            if('0'<= c && c <='9'){
                list.add(c-'0');
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}