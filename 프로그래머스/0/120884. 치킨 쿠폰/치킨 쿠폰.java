class Solution {
    public int solution(int chicken) {
        int sum = 0;
        int bonus_chicken = 0;
        int coupon = chicken;
        while(coupon >= 10) {
            bonus_chicken = coupon / 10;
            coupon = bonus_chicken + coupon % 10;
            sum += bonus_chicken;
        }
        return sum;
    }
}