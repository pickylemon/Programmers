class Solution {
    public int solution(int[] common) {
        int len = common.length;
        int cDiff = common[1] - common[0];
        
        //만약 원소 중 0이 포함되어 있다면
        for(int i : common) {
            if(i == 0) return common[len-1] + cDiff;
        }
        //0이 포함되어 있지 않으면 등차, 등비 구분 필요
        double cRatio = common[1] / (double)common[0];        
        if(common[2]/(double)common[1] == cRatio) 
            return (int)(common[len-1] * cRatio);
        else {
            return common[len-1] + cDiff;
        }
    }
}