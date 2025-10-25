class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];
        
        int max = aa(n, m);
        int min = (n * m) / max;
        
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    }
    
    public int aa(int n, int m){
        int res = 0;
        if(n > m){
            res = n % m;
            if(res == 0) return m;
            else return aa(m, res);
        }
        else{
            res = m % n;
            if(res == 0) return n;
            else return aa(n, res);
        }  
    }
}