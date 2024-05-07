class Solution {
    public int solution(int n) {
        int multiply = 1;
        int i = 0;
        int answer = 0;
        while(multiply <= n){
            answer = i;
            multiply *= ++i;
        }
        return answer;
    }
}