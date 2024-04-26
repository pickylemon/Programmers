class Solution {
    public int[] solution(int money) {
        int coffee = money / 5500;
        int change = money - coffee * 5500;
        
        return new int[]{coffee, change};
    }
}