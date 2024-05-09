class Solution {
    public String[] solution(String my_str, int n) {
        int len = (my_str.length()-1)/n + 1;
        String[] answer = new String[len];
        for(int i=0; i<len; i+=1){
            if(i < len-1) {
                answer[i] = my_str.substring(i*n, (i+1)*n);
            } else {
                answer[i] = my_str.substring(i*n);
            }
            
        }
        return answer;
    }
}