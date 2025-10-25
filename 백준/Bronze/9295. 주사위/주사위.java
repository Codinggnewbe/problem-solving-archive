import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nums = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < nums; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			int res = num1 + num2;
			list.add(res);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Case " + (i + 1) + ": " + list.get(i));
		}
	}
}