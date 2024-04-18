import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        //해당하는 정수를 채우기
        List<Integer> temp = new ArrayList<>();
        for(int i=l; i<=r; i++){
            if(onlyFiveZero(i)){
                temp.add(i);
            }
        }
        
        if(temp.isEmpty()){
            return new int[]{-1};
        }
        
        temp.sort(Comparator.naturalOrder()); //정렬
        
        int[] answer = new int[temp.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
        
    }
    private boolean onlyFiveZero(int i){
        boolean answer = false;
        while(i > 0) {
            answer = false;
            if((i%10)%5 == 0) { //일의 자리가 5 또는 0인지 검사
                answer = true;
                i/=10;
            } else {
                break;
            }
        }
        return answer;
    }
}