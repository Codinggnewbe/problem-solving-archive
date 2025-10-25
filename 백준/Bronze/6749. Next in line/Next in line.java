import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int last = scanner.nextInt();
		int middle = scanner.nextInt();
		int gap = middle - last;
		int first = middle + gap;
		
		System.out.println(first);
	}
}