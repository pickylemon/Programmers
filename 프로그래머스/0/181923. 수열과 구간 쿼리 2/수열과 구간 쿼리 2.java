import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];
        
        for(int i=0; i<len; i++) {
            int[] subArr = Arrays.copyOfRange(arr, queries[i][0], queries[i][1]+1);
            Arrays.sort(subArr);
            answer[i] = -1;
            for(int j=0; j<subArr.length; j++) {
                if(subArr[j] > queries[i][2]) {
                    answer[i] = subArr[j];
                    break;
                }
            }
        }
        return answer;
        
    }
}