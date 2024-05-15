class Solution {
    public int solution(int[] common) {
        //등차이면서 등비일수는 없으니, 
        //상대적으로 간단한 등차조건만 비교하고 나머지는 모두 등비 취급
        
        int len = common.length;
        int cDiff = common[1] - common[0];
        
        if(common[2]-common[1] == cDiff)
            return common[len-1] + cDiff;
        else return common[len-1] * (common[1]/common[0]);
        
    }
}