class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i < number.length - 2; i++){
            int first = number[i];
            for(int j = i + 1; j < number.length - 1; j++){
                int second = number[j];
                for(int n = j + 1; n < number.length; n++){
                    int third = number[n];
                    int sum = first + second + third;
                    if(sum == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}