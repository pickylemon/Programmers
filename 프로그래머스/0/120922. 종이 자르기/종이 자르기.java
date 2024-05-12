class Solution {
    public int solution(int M, int N) {

        int max = Math.max(M,N);
        int min = Math.min(M,N);
        
        return (max-1) + (min-1) * max;
    }
}