class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String front = phone_number.substring(0, phone_number.length() - 4);
        String back = phone_number.substring(phone_number.length() - 4);
        if(phone_number.length() == 4) answer = phone_number;
        else{
            for(int i = 0; i < front.length(); i++){
                answer += "*";
                
            }
            answer += back;
        } 
        return answer;
    }
}