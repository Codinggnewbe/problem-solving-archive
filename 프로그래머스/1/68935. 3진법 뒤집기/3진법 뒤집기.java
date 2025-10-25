import java.util.*;
class Solution {
    public int solution(long n) {
        int answer = 0;
        ArrayList<Long> list = new ArrayList<>();
        
        while(n > 0){
            long num = n % 3;
            list.add(num);
            n /= 3;
        }
        
        int size = 0;
        for(int i = list.size() - 1; i >= 0; i--){
            long num = list.get(i);
            answer += Math.pow(3, size) * num;
            size++;
        }
        
        return answer;
    }
}