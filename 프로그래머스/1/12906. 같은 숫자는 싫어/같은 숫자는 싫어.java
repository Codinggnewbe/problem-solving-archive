import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            if(i == 0) list.add(arr[i]);
            else{
                if(num == arr[i- 1]) continue;
                else list.add(num);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}