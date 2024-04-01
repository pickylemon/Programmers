import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> deque = new ArrayDeque();
        int i = 0;
        
        while(i<arr.length) {
            if(deque.isEmpty() || deque.peekLast() != arr[i]){
                deque.addLast(arr[i]);
                i++;
            } else if(deque.peekLast() == arr[i]) {
                deque.removeLast();
                i++;
            }
        }
        
        if(deque.isEmpty()) return new int[]{-1};
        
        return deque.stream().mapToInt(Integer::intValue).toArray();
        
    }
}