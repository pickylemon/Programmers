class Solution {
    public int solution(String s) {
        //이전 값을 기억해두어야 한다.
        String[] strArr = s.split(" ");
        int sum = 0;
        String tmp = "";
        for(String str : strArr) {
            if(str.equals("Z")) {
                sum -= Integer.parseInt(tmp);
            } else {
                sum += Integer.parseInt(str);
                tmp = str;
            }
        }
        return sum;
    }
}