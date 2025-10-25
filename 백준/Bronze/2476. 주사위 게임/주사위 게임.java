import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> number = new ArrayList<>();
		
		int num = scanner.nextInt();
		for(int i = 0; i < num; i++) {
			int first = scanner.nextInt();
			int second = scanner.nextInt();
			int third = scanner.nextInt();
			number.add(first);
			number.add(second);
			number.add(third);
			int sum = 0;
			if(first == second && second == third) {
				sum = 10000 + first * 1000;
				list.add(sum);
			}
			else if(first == second && second != third && third != first) {
				sum = 1000 + first * 100;
				list.add(sum);
			}
			else if(second == third && first != third && third != first) {
				sum = 1000 + second * 100;
				list.add(sum);
			}
			else if(third == first && third != second && second != first) {
				sum = 1000 + third * 100;
				list.add(sum);
			}
			else {
				int max = number.get(0);
				for(int j = 1; j < number.size(); j++) {
					if(max < number.get(j)) {
						max = number.get(j);
					}
				}
				sum = max * 100;
				list.add(sum);
			}
		}
		int max = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println(max);
	}
}