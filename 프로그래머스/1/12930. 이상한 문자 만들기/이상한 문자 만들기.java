class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ", -1);
        
        for(int i = 0; i < words.length; i++){
            String ss = words[i];
            String temp = "";
            for(int j = 0; j < ss.length(); j++){
                char c = ss.charAt(j);
                if(j == 0 || j % 2 == 0){ // 짝수번째
                    if(c >= 65 && c <= 90){
                        temp += String.valueOf(c);
                    }
                    else{ // 짝수번째인데 소문자인경우
                        c -= 32;
                        temp += String.valueOf(c);
                    }
                }
                else{ // 홀수번째
                    if(c >= 97 && c <= 122){
                        temp += String.valueOf(c);
                    }
                    else{
                        c += 32;
                        temp += String.valueOf(c);
                    }
                }
            }
            words[i] = temp;
        }
        for(int i = 0; i < words.length; i++){
            if(i == words.length - 1)
                answer += words[i];
            else
                answer += words[i] + " ";
        }
        return answer;
    }
}