import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nums = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < nums; i++) {
			int w = scanner.nextInt();
			int k = scanner.nextInt();
			int res = w * k / 2;
			list.add(res);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}