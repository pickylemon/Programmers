class Solution {
    public int solution(int angle) {
        int answer = angle / 90 + 1;
        if(angle > 90){
            answer += 1;
        }
        
        return answer;
    }
}