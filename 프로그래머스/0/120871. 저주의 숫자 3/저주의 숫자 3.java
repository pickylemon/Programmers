class Solution {
    public int solution(int n) {
        int cnt = 0;
        for(int i=1; i<=n+cnt; i++){
            if(isForbidden(i)) cnt++;
        }
        
        return n+cnt;
    }
    private boolean isForbidden(int n){
        return String.valueOf(n).contains("3") 
            || n % 3 == 0;
    }
}