import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int col1 = scanner.nextInt();
		int row1 = scanner.nextInt();
		int col2 = scanner.nextInt();
		int row2 = scanner.nextInt();
		
		System.out.println(col1 * row1 + col2 * row2);
	}
}