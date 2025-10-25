import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int people = scanner.nextInt();
		
		int count = 0;
		for(int i = 0; i < people; i++) {
			if(count > 0 && count % 6 == 0) {
				System.out.print("Go! ");
				System.out.print(i + 1 + " ");
			}
			else
				System.out.print(i + 1 + " ");
			count++;
			
			if(count == people)
				System.out.print("Go!");
		}
	}
}