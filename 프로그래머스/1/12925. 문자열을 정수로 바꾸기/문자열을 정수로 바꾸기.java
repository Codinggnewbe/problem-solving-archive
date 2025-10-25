class Solution {
    public int solution(String s) {
        int answer = 0;
        String first = s.substring(0, 1);
        
        if(first == "+"){
            s = s.substring(1);
            int num = Integer.valueOf(s);
            answer = +num;
            
        }
        else if(first == "="){
            s = s.substring(1);
            int num = Integer.valueOf(s);
            answer = -num;
        }
        else{
            answer = Integer.valueOf(s);
            
        } 
        return answer;
        
    }
}