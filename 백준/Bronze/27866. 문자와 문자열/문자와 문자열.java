import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		int n = scanner.nextInt();
		n -= 1;
		
		char ch = word.charAt(n);
		System.out.println(ch);
	}
}