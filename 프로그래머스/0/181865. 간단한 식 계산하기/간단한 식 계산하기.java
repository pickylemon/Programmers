import java.util.*;

class Solution {
    public int solution(String binomial) {
        String[] calc = binomial.split(" ");
        int a = Integer.parseInt(calc[0]);
        int b = Integer.parseInt(calc[2]);
        String op = calc[1];
        
        int answer = a+b;
        
        if(op.equals("-")){
            answer = a-b;
        } else if(op.equals("*")){
            answer = a*b;
        }
        
        return answer;
            
        
    }
}