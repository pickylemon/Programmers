class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int diff = 'a' - 'A';
        for(char c : my_string.toCharArray()){
            if('a'<= c && c<='z'){
                sb.append((char)(c - diff));
            } else {
                sb.append((char)(c + diff));
            }
        }
        return sb.toString();
        
        
    }
}