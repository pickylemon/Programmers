import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int midIdx = (array.length+1)/2;
        return array[midIdx-1];
    }
}