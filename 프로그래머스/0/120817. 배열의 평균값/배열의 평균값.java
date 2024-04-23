class Solution {
    public double solution(int[] numbers) {
        int len = numbers.length;
        int sum  = 0;
        for(int n : numbers){
            sum += n;
        }
        
        return (double)sum/len;
    }
}