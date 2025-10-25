import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			int correct = scanner.nextInt();
			list.add(correct);
		}
		
		int sum = 0;
		int one = 0;
		for(int i = 0; i < list.size(); i++) {
			int a = list.get(i);
			if(a == 1) {
				sum += (1 + one);
				one++;
			}
			else {
				sum += 0;
				one = 0;
			}
		}
		System.out.println(sum);
	}
}