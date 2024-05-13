import java.util.stream.*;

class Solution {
    public int[] solution(int num, int total) {
        int midIdx = num %2 == 0? (num/2)-1 : num/2;
        int midVal = total / num;
        
        int[] answer = new int[num];
        for(int i=0; i<num; i++) {
            answer[i] = midVal - midIdx + i;
        }
        return answer;
    }
}