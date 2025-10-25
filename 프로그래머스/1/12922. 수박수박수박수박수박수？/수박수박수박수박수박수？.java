class Solution {
    public String solution(int n) {
        String answer = "";
        if(n % 2 == 0){
            for(int i = 0; i < n; i += 2){
                answer += "수박";
            }
        }
        else{
            if(n == 1) answer += "수";
            else{
                answer = "수";
                for(int i = 1; i < n; i += 2){
                    answer += "박수";
                }
            }
        }
        return answer;
    }
}