class Solution {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        long res = 0;
        
        if(num == Math.floor(num)){
            res = (long)num + 1;
            answer = res * res;
        }
        else answer = -1;
        return answer;
    }
}