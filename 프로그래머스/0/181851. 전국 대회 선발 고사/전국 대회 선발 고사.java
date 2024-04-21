import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List list = new ArrayList();
        for(int r : rank){
            list.add(r);
        }
        
        int[] arr = IntStream.range(0, rank.length)
            .filter(i->attendance[i])
            .map(j-> rank[j])
            .sorted()
            .limit(3)
            .map(list::indexOf)
            .toArray();
        
        System.out.println(Arrays.toString(arr));
        // System.out.println();
        
        return 10000 * arr[0] + 100 * arr[1] + arr[2];
    }
}