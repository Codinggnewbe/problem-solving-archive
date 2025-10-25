class Solution {
    public long solution(long price, long money, int count) {
        long answer = -1;
        long up = price;
        for(int i = 0; i < count; i++){
            money -= price;
            price += up;
        }
        if(money >= 0) answer = 0;
        else answer = Math.abs(money);

        return answer;
    }
}