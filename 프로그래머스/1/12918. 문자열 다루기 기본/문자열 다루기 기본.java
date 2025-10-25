class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int num = 0;
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c >= 48 && c <= 57) num++;
            }
        }
        if(num != s.length()) answer = false;
        else answer = true;
        return answer;
    }
}