import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[s.length()];
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put(String.valueOf(s.charAt(0)), 0);
        answer[0] = -1; // 항상 맨 앞은 처음 나오는 것이기 때문
                
        for(int i = 1; i < s.length(); i++){
            String t = String.valueOf(s.charAt(i));
            if(map.containsKey(t)){
                int num = map.get(t);
                int diff = i - num;
                answer[i] = diff;
                map.put(t, i);
            }
            else{
                map.put(t, i);
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}