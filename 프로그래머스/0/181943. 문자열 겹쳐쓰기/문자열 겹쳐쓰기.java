class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int len = overwrite_string.length();
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0,s));
        sb.append(overwrite_string);
        sb.append(my_string.substring(s+len));
        
        return sb.toString();
    }
}