class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ') {
                answer += String.valueOf(c);
                continue;
            }
            
            if(c >= 65 && c <= 90){ // 대문자일때
                char up = (char)(c + n);
                if(up > 90){
                    char down = (char)(up - 90);
                    up = (char)(65 + down - 1);
                }
                answer += String.valueOf(up);
                
            }
            else if(c >= 97 && c <= 122){ // 소문자일때
                char up = (char)(c + n);
                if(up > 122){
                    char down = (char)(up - 122);
                    up = (char)(97 + down - 1);
                }
                answer += String.valueOf(up);
            }
        }
        
        return answer;
    }
}