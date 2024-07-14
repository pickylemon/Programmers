import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int denom3 = denom1 * denom2;
        
        int gcd = getGCD(numer3, denom3);
        System.out.printf("numer3=%d, denom3=%d, gcd=%d", numer3, denom3, gcd);
        
        return new int[]{numer3 / gcd, denom3 / gcd};
        
        
    }
    
    private int getGCD(int a, int b) {
        int answer = 0;
        
        if(a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        if(b==0) {
            return a;
        }
        
        return getGCD(b, a%b);
    }
}