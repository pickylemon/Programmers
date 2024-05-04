class Solution {
    public String solution(int age) {
        StringBuffer sb = new StringBuffer();
        String strAge = "" + age;
        for(char c : strAge.toCharArray()){
            sb.append((char)(c-'0'+'a'));
        }
        return sb.toString();
        
    }
}