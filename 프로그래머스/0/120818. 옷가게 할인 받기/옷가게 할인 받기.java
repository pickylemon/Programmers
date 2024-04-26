class Solution {
    public int solution(int price) {
        double answer;
        switch(price / 100000) {
            case 0 : 
                answer = price;
                break;
            case 1,2 : 
                answer = price * 0.95;
                break;
            case 3,4 : 
                answer = price * 0.9;
                break;
            default : 
                answer = price * 0.8;
        }
        
        return (int)answer;
    }
}