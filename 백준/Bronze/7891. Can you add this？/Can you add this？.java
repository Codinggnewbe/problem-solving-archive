import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		int lines = scanner.nextInt();
		for(int i = 0; i < lines; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			list.add(num1);
			list2.add(num2);
		}
		for(int i = 0; i < list.size(); i++) {
			int first = list.get(i);
			int second = list2.get(i);
			System.out.println(first + second);
		}
	}
}