class Solution {
    public int solution(int n, int k) {
        int total = 0;
        //양꼬치 가격 계산
        total += 12000 * n;
        //음료 계산
        total += 2000 * (k - n/10);
        
        return total;
    }
}