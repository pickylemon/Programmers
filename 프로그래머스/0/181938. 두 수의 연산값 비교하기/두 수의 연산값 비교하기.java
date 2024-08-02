import java.lang.*;

class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b).toString();
        int concatNum = Integer.parseInt(sb.toString());
        
        return concatNum > 2 * a * b ? concatNum : 2 * a * b;
        
    }
}