import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nowYear = scanner.nextInt();
		int futureYear = scanner.nextInt();
		
		int year = nowYear;
		while(true) {
			if(year > futureYear)
				break;
			else {
				System.out.println("All positions change in year " + year);
				year = year + 60;
			}
				
		}
	}
}