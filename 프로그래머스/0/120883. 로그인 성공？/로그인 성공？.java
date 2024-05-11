class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String msg = "fail";
        for(String[] data : db) {
            if(data[0].equals(id_pw[0])){
                msg = "wrong pw";
                if(data[1].equals(id_pw[1])){
                    msg = "login";
                }
            } 
        }
        return msg;
    }
}