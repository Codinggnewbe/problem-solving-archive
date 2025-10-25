class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] temp = new int[1][2];
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                temp[0][0] = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp[0][0];
            }
        }
        int w = sizes[0][0];
        int h = sizes[0][1];
        for(int i = 1; i < sizes.length; i++){
            if(w < sizes[i][0]) w = sizes[i][0];
            if(h < sizes[i][1]) h = sizes[i][1];
        }
        answer = w * h;
        return answer;
    }
}