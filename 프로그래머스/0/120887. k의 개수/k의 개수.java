class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        for(int s=i; s<=j; s++) {
            int tmp = s;
            while (tmp > 0) {
                if(tmp % 10 == k) cnt++;
                tmp /= 10;
            }
        }
        return cnt;
    }
}