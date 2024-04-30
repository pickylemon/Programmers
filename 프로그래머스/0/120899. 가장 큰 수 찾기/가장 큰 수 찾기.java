import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int idx = 0;
        int max = array[idx];
        for(int i=1; i<array.length; i++) {
            if(array[i] > max){
                max = array[i];
                idx = i;
            }
        }
        
        return new int[]{max, idx};
    }
}