class Solution {
    public int solution(int num, int k) {
        String[] numArr = ("" + num).split("");
        String str = "" + k;
        for(int i=0; i<numArr.length; i++) {
            if(numArr[i].equals(str)){
                return i+1;
            }
        }
        return -1;
    }
}