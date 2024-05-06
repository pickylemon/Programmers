class Solution {
    public String solution(String my_string) {
        String[] strArr = my_string.split("");
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < strArr.length; i++){
            boolean duplicated = false;
            for(int j = 0; j < i; j++){
                if(strArr[i].equals(strArr[j])){
                    duplicated = true;
                    break;
                }
            }
            if(!duplicated) {
                sb.append(strArr[i]);
            }
        }
        
        return sb.toString();
    }
}