import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                          "--.","....","..",".---","-.-",".-..","--",
                          "-.","---",".--.","--.-",".-.","...","-",
                          "..-","...-",".--","-..-","-.--","--.."};
        List<String> list = List.of(morse);
        
        String[] letterArr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : letterArr) {
            sb.append((char)(list.indexOf(s)+'a'));
        }
        
        return sb.toString();
    }
}