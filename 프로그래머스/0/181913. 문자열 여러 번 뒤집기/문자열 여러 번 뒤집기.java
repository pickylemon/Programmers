class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i=0; i<queries.length; i++) {
            StringBuilder sb = new StringBuilder();
            StringBuilder subSb = new StringBuilder();
            sb.append(my_string.substring(0, queries[i][0]));
            subSb.append(my_string.substring(queries[i][0], queries[i][1]+1));
            sb.append(subSb.reverse());
            sb.append(my_string.substring(queries[i][1]+1));
            my_string = sb.toString();
        }
        
        return my_string;
    }
}