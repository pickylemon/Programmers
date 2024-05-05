import java.util.stream.*;

class Solution {
    public int[] solution(String my_string) {
        String[] tmp = my_string.replaceAll("[a-z|A-Z]","").split("");
        return Stream.of(tmp)
            .sorted()
            .mapToInt(Integer::parseInt)
            .toArray();
    }
}