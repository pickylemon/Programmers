import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        for(int i=2; i<= n; i++){
           if(n % i == 0 && isPrimeNumber(i)) {
               set.add(i);
           }
        }
        
        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
    
    private boolean isPrimeNumber(int n) {
        int cnt = 0;
        
        for(int i=1; i<=n; i++) {
            if(n % i ==0) {
                cnt++;
                if(cnt > 2) return false;
            }
        } 
        return true;
    }
}