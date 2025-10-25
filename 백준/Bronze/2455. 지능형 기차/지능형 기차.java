import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			int out = scanner.nextInt();
			int in = scanner.nextInt();
			sum -= out;
			sum += in;
			list.add(sum);
		}
		
		int max = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			int a = list.get(i);
			if(max < a) {
				max = a;
			}
		}
		System.out.println(max);

	}
}