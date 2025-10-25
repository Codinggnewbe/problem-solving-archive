import java.util.*;
class Solution {
    public long solution(String s) {
        long answer;
        String t = "";
        String res = "";
        String tt = "";
        
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){ // 숫자라면
                t = String.valueOf(c);
                res += t;
                System.out.println(res + " " + i + "\n");
            }
            else{ // 숫자가 아니라면
                t = String.valueOf(c);
                if(t.equals("z")){ // 0
                    res += "0";
                    i += 3;
                    System.out.println(res + " " + i + "\n");
                }
                else if(t.equals("o")){ // 1
                    res += "1";
                    i += 2;
                    System.out.println(res + " " + i + "\n");
                }
                else if(t.equals("t")){ // 2, 3
                    tt = String.valueOf(s.charAt(i+1));
                    if(tt.equals("w")){
                        res += "2";
                        i += 2;
                        System.out.println(res + " " + i + "\n");
                    }
                    else if(tt.equals("h")){
                        res += "3";
                        i += 4;
                        System.out.println(res + " " + i + "\n");
                    }
                }
                else if(t.equals("f")){ // 4, 5
                    tt = String.valueOf(s.charAt(i+1));
                    if(tt.equals("o")){
                        res += "4";
                        i += 3;
                        System.out.println(res + " " + i + "\n");
                    }
                    else if(tt.equals("i")){
                        res += "5";
                        i += 3;
                        System.out.println(res + " " + i + "\n");
                    }
                }
                else if(t.equals("s")){ // 6, 7
                    tt = String.valueOf(s.charAt(i+1));
                    if(tt.equals("i")){
                        res += "6";
                        i += 2;
                        System.out.println(res + " " + i + "\n");
                    }
                    else if(tt.equals("e")){
                        res += "7";
                        i += 4;
                        System.out.println(res + " " + i + "\n");
                    }
                }
                else if(t.equals("e")){ // 8
                    res += "8";
                    i += 4;
                    System.out.println(res + " " + i + "\n");
                }
                else if(t.equals("n")){ // 9
                    res += "9";
                    i += 3;
                    System.out.println(res + " " + i + "\n");
                }
            }
        }
        answer = Long.valueOf(res);
        return answer;
    }
}