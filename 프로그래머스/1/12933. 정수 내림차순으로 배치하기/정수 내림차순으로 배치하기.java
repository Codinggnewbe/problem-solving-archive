import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        String[] num = new String[s.length()];
        long answer = 0;
        
        for(int i = 0; i< s.length(); i++){
            num[i] = String.valueOf(s.charAt(i));
        }
        
        Arrays.sort(num, Collections.reverseOrder());
        
        String ss = "";
        for(int i = 0; i < s.length(); i++){
            ss += num[i];
        }
        
        answer = Long.valueOf(ss);
        
        return answer;
    }
}