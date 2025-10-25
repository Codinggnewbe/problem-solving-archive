class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int res = 0;
        
        while(num > 0){
            res += num % 10;
            num /= 10;
        }
        
        if(x % res == 0) answer = true;
        else answer = false;
        return answer;
    }
}