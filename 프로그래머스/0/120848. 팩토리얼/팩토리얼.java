class Solution {
    public int solution(int n) {
        int multiply = 1;
        int i = 0;
        while(true){
            if(multiply <= n){
                multiply *= ++i;
            } else break;
        }
        
        return i-1;
    }
}