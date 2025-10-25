import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        for(int i = 0; i < d.length; i++){
            budget -= d[i];
            if(budget >= 0){
                answer++;
            }
            System.out.println(i + "번째 지급 후 남은 금액 : " + budget);
        }
        
        return answer;
    }
}