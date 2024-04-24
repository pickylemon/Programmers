class Solution {
    public int solution(int n) {
        int i = 0;
        while(true) {
            if( (i*7)/n >= 1){
                break;
            }
            i++;
        }
        return i;
    }
}