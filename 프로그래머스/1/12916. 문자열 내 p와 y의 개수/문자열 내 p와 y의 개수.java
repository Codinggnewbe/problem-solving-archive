class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char c;
        int p = 0;
        int y = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(c == 'p') p++;
            else if(c == 'y') y++;
        }
        if(p == y) answer = true;
        else answer = false;

        return answer;
    }
}