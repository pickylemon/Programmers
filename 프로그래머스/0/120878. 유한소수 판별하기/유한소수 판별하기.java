class Solution {
    public int solution(int a, int b) {
        a %= b;
        b /= GCD(b, a);
        
        while(b!=1) {
            if(b%2 == 0){
                b /= 2;
            } else if(b%5 == 0) {
                b /= 5;
            } else {
                return 2;
            }
        }      
        return 1; 
    }
    
    private int GCD(int max, int min) {
        if(max < min) {
            int temp = min;
            min = max;
            max = temp;
        }
        
        while(min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }
        return max;
    }
}