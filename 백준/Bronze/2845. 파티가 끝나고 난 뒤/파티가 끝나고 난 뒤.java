import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int people = scanner.nextInt();
		int area = scanner.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			int n = scanner.nextInt();
			list.add(n);
		}
		
		for(int i = 0; i < list.size(); i++) {
			int n = list.get(i);
			if(people * area == n)
				System.out.print("0 ");
			else if(people * area > n) // 1 * 10 9
				System.out.print(n - (people * area) + " ");
			else if(people * area < n) // 1 * 10 11
				System.out.print(n - (people * area) + " ");
		}
	}
}