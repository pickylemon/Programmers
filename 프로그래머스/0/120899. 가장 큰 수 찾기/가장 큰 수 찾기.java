import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i : array){
            list.add(i);
        }
        Arrays.sort(array);
        
        int len = array.length;
        int max = array[len-1];
        return new int[]{max, list.indexOf(max)};
    }
}