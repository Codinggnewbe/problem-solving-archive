import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        
        if(minute >= 45) { // 기본적으로 45를 뺀다
        	minute -= 45;
        }
        else if(minute < 45) { 
        	if(hour == 0) { // 시간이 0이고, 분이 45보다 작다면 시간을 23으로 바꾸고 분에 60분 추가한다
        		hour = 23;
        		minute += 60;
            	minute -= 45;
        	}
        	else { // 분이 45보다 작으면 시간도 1을 빼고 분에 60을 추가한다
        		hour -= 1;
            	minute += 60;
            	minute -= 45;
        	}
        }
        System.out.println(hour + " " + minute);
    }
}