class Solution {
    public int solution(int[] box, int n) {
        int max = 1;
        for(int i : box) {
            max *= i / n;
        }
        
        return max;
    }
}