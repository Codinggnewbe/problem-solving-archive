import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int a = scanner.nextInt();
			if(a < 40)
				sum += 40;
			else
				sum += a;
		}
		
		System.out.println((int)sum/5);
	}
}