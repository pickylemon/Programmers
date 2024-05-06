class Solution {
    public int solution(int n) {
        int num = 1;
        while(true) {
            if((6*num) % n == 0) break;
            num++;
        }
        return num;
    }
}