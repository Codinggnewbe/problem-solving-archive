import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int minTotal = 0;
		for(int i = 0; i < 4; i++) {
			int grade = scanner.nextInt();
			minTotal += grade;
		}
		
		int manTotal = 0;
		for(int i = 0; i < 4; i++) {
			int grade = scanner.nextInt();
			manTotal += grade;
		}
		
		if(minTotal > manTotal)
			System.out.println(minTotal);
		else if(minTotal < manTotal)
			System.out.println(manTotal);
		else
			System.out.println(minTotal);
	}
}