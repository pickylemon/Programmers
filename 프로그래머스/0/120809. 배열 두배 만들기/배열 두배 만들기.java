import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        return IntStream.of(numbers)
            .map(i->2*i)
            .toArray();
    }
}