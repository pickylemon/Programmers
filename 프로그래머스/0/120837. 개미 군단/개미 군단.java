class Solution {
    public int solution(int hp) {
        int top = hp / 5;
        int middle = (hp - top*5) / 3;
        int low = hp - top*5 - middle*3;
        
        return top + middle + low;
    }
}