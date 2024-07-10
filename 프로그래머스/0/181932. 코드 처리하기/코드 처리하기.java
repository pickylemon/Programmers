class Solution {
    public String solution(String code) {
        StringBuffer sb = new StringBuffer();
        int mode = 0;
        
        String[] strArr = code.split("");
        for(int i=0; i<strArr.length; i++) {
            if(mode == 0) {
                if(strArr[i].equals("1")) {
                    mode = 1;
                } else {
                    if(i%2==0) {
                        sb.append(strArr[i]);
                    }
                }
            } else {
                if(strArr[i].equals("1")) {
                    mode = 0;
                } else {
                    if(i%2==1) {
                        sb.append(strArr[i]);
                    }
                }
            }
        }
        
        String answer = sb.toString();
        return answer.equals("") ? "EMPTY" : answer;
    }
}