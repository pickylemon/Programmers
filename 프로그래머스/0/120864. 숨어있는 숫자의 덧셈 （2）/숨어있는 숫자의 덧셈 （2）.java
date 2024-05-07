import java.util.stream.*;

class Solution {
    public int solution(String my_string) {
        return Stream.of(my_string.split("[^0-9]"))
            .filter(s->!s.equals(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}