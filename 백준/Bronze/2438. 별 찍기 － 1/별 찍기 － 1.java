import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int j = 1; j <= i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}