import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(list.size() == 0) list.add(sum);
                else{
                    int sameCount = 0;
                    for(int n = 0; n < list.size(); n++){
                        int num = list.get(n);
                        if(sum == num) sameCount++;
                    }
                    if(sameCount == 0) list.add(sum);
                }
            }
        }
        Collections.sort(list);
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}