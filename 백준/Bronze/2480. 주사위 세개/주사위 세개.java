import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		list.add(num1);
		list.add(num2);
		list.add(num3);
		
		if(num1 == num2 && num2 == num3 && num3 == num1) {
			int res = 10000 + (num1 * 1000);
			System.out.println(res);
		}
		else if(num1 == num2) {
			int res = 1000 + num1 * 100;
			System.out.println(res);
		}
		else if(num2 == num3) {
			int res = 1000 + num2 * 100;
			System.out.println(res);
		}
		else if(num3 == num1) {
			int res = 1000 + num3 * 100;
			System.out.println(res);
		}
		else if(num1 != num2 && num2 != num3 && num3 != num1) {
			int max = list.get(0);
			for(int i = 1; i < list.size(); i++) {
				if(max < list.get(i))
					max = list.get(i);
			}
			int res = max * 100;
			System.out.println(res);
		}
	}
}