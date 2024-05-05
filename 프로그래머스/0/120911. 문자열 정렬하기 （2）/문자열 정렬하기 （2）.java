import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toCharArray();
        for(int i=0; i<charArr.length; i++) {
            if(charArr[i] < 'a') {
                charArr[i] = (char)(charArr[i] - 'A' + 'a');
            }
        }

        Arrays.sort(charArr);
        return new String(charArr); 
    }
}