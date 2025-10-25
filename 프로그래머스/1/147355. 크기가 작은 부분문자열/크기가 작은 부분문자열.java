class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String temp = "";
        int len = p.length();
        for(int i = 0; i < t.length() - (len - 1); i++){
            temp = t.substring(i, i+len);
            if(p.compareTo(temp) >= 0) answer++;
        }
        
        return answer;
    }
}