import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Double> list = Stream.of(score)
            .map(s -> IntStream.of(s).average().getAsDouble())
            .collect(Collectors.toList());
        
        List<Double> list2 = new ArrayList<>();
        
        for(Double d : list) {
            list2.add(d);
        }
        
        Collections.sort(list, Comparator.reverseOrder());
        
        return list2.stream().mapToInt(d -> list.indexOf(d)+1)
            .toArray();
    }
}