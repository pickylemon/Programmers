import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        for(int i : num_list) {
            deq.push(i);
        }
        
        int[] answer = new int[num_list.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = deq.pop();
        }
        
        return answer;
    }
}