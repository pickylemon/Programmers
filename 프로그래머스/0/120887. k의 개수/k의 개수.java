class Solution {
    public int solution(int i, int j, int k) {
        StringBuffer sb = new StringBuffer();
        for(int s=i; s<=j; s++){
            sb.append(s);
        }
        String tmp = sb.toString();
        int beforeLen = tmp.length();
        
        String str = String.valueOf(k);
        tmp = tmp.replace(str, "");
        int afterLen = tmp.length();
        
        return beforeLen - afterLen;
    }
}