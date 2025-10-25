import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int r1 = scanner.nextInt();
		int s = scanner.nextInt();
		int r2 = (s * 2) - r1;
		
		System.out.println(r2);
	}
}