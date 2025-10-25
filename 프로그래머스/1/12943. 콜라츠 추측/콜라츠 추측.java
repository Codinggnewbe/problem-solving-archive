class Solution {
    public int solution(int num) {
        int answer = 0;
        int i = 0;
        
        while(true){
            if(i > 500){
                answer = -1;
                break;
            }
            if(num == 1){
                answer = 0;
                break;
            }
            if(num % 2 == 0) num = num / 2;
            else if(num % 2 == 1) num = num * 3 + 1;
            i++;
            if(num == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}