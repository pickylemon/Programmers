import java.util.*;

class Solution {
    public long solution(String numbers) {
        List<String> strList = List.of("zero","one","two","three","four",
                                       "five", "six","seven","eight","nine");
        
        for(String s : strList){
            if(numbers.indexOf(s) != -1){
                numbers = numbers.replace(s, strList.indexOf(s)+"");
            }
        }
        
        return Long.valueOf(numbers);
    }
}