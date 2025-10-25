class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int len = s.length();
        int[] answer = new int[len];
        int res = 0;
        int i = 0;
        
        while(n > 0){
            res = (int)(n % 10);
            answer[i] = res;
            i++;
            n /= 10;
        }
        return answer;
    }
}