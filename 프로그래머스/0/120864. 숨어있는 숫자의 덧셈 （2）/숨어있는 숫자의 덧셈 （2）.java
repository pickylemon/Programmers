import java.util.stream.*;

class Solution {
    public int solution(String my_string) {
        String tmp = my_string.replaceAll("[a-z|A-Z]",",");
        return Stream.of(tmp.split(","))
            .filter(s->!s.equals(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}