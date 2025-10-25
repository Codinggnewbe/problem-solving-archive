class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long run = x;
        long cur = x;
        
        for(int i = 0; i < n; i++){
            answer[i] = cur;
            cur += run;
        }
        
        return answer;
    }
}