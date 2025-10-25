import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int squares = scanner.nextInt();
		
		double squareRoot = Math.sqrt(squares);
		
		int num = (int)Math.floor(squareRoot);
		
		System.out.println("The largest square has side length " + num + ".");
	}
}