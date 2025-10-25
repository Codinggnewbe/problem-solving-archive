import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int nowHour = scanner.nextInt();
		int nowMinute = scanner.nextInt();
		int givenMinute = scanner.nextInt();
		
		if(givenMinute >= 60) {
			int calHour = givenMinute / 60;
			int calMinute = givenMinute - 60 * calHour;
			
			nowHour += calHour;
			nowMinute += calMinute;
			if(nowMinute >= 60) {
				nowMinute -= 60;
				nowHour += 1;
			}
			if(nowHour >= 24) {
				nowHour -= 24;
			}
		}
		else {
			nowMinute += givenMinute;
			if(nowMinute >= 60) {
				nowMinute -= 60;
				nowHour += 1;
			}
			if(nowHour >= 24) {
				nowHour -= 24;
			}
		}
		System.out.println(nowHour + " " + nowMinute);
	}
}