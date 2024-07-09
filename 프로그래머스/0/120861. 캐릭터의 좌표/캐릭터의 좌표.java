class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result = new int[2];
        
        int max_width = board[0] / 2;
        int min_width = (board[0] / 2)*(-1);
        int max_height = board[1] / 2;
        int min_height = (board[1] / 2)*(-1);
        
        for(String s : keyinput) {
            if(s.equals("left")){
                if(result[0] == min_width) {
                    continue;
                }
                result[0] -= 1;
            } else if(s.equals("right")) {
                if(result[0] == max_width) {
                    continue;
                }
                result[0] += 1;
            } else if(s.equals("down")){
                if(result[1] == min_height) {
                    continue;
                }
                result[1] -= 1;
            } else {
                if(result[1] == max_height) {
                    continue;
                }
                result[1] += 1;
            }
        }
        return result;
    }
}