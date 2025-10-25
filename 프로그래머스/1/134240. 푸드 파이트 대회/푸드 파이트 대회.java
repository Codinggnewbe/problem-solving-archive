import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < food.length; i++){
            int count = food[i] / 2;
            list.add(count);
        }
        int num = 1;
        for(int i = 0; i < list.size(); i++){
            int count = list.get(i);
            for(int j = 0; j < count; j++){
                answer += num;
            }
            num++;
        }
        answer += 0;
        
        num = food.length - 1;
        for(int i = list.size() - 1; i >= 0; i--){
            int count = list.get(i);
            for(int j = 0; j < count; j++){
                answer += num;
            }
            num--;
        }
        return answer;
    }
}