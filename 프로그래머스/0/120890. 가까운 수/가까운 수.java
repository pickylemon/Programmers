import java.util.*;

class Solution {
    public int solution(int[] array, int n) {    
        int answer = array[0];
        for(int i=1; i<array.length; i++) {
            if(Math.abs(array[i] - n) < Math.abs(answer - n)){
                answer = array[i];
            } else if (Math.abs(array[i] - n) == Math.abs(answer - n)){
                answer = array[i] < answer ? array[i] : answer;
            }
        }
    
        return answer;
    } 
    
}