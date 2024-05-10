class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] expression = my_string.split(" ");
        for(int i=0; i<expression.length; i++){
            if(!expression[i].equals("+")&&
              !expression[i].equals("-")) {
                answer += Integer.parseInt(expression[i]);
            } else if(expression[i].equals("-")) {
                expression[i+1] = "-"+expression[i+1];
            }
        }
        
        return answer;
    }
}