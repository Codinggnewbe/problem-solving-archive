import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int num = scanner.nextInt();
		int th = scanner.nextInt();
		int i = 1;
		
		while(true) {
			if(i > num) break;
			if(num % i != 0) i++;
			else if(num % i == 0) {
				list.add(i);
				i++;
			}
		}
		if(th > list.size()) {
			System.out.println("0");
		}
		else {
			System.out.println(list.get(th - 1));
		}
	}
}