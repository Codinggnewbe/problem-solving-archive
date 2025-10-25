class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0){
            int num = s.length() / 2;
            answer = String.valueOf(s.charAt(num - 1)) + String.valueOf(s.charAt(num));
        }
        else if(s.length() % 2 == 1){
            
            int num = s.length() / 2;
            answer = String.valueOf(s.charAt(num));
        }
        return answer;
    }
}