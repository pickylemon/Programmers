class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int cnt = 0;
        boolean isAMember = false;
        for(String[] data : db ){
            cnt = 0; //매 라운드마다 0으로 초기화
            if(data[0].equals(id_pw[0])){
                cnt++;
                isAMember = true;
                if(data[1].equals(id_pw[1])){
                    cnt++;
                }
            } 
            if(cnt == 2) return "login";
        }
        return isAMember? "wrong pw" : "fail";
    }
}