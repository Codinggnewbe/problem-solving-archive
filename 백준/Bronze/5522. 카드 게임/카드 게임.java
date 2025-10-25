import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			int n = scanner.nextInt();
			list.add(n);
		}
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			sum += num;
		}
		System.out.println(sum);
	}
}