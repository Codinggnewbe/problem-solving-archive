import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			int zero = 0;
			int one = 0;
			
			int first = scanner.nextInt();
			int second = scanner.nextInt();
			int third = scanner.nextInt();
			int four = scanner.nextInt();
			
			if(first == 1) one++;
			else if(first == 0) zero++;
			
			if(second == 1) one++;
			else if(second == 0) zero++;
			
			if(third == 1) one++;
			else if(third == 0) zero++;
			
			if(four == 1) one++;
			else if(four == 0) zero++;
			
			if(zero == 1 && one == 3) list.add("A");
			else if(zero == 2 && one == 2) list.add("B");
			else if(zero == 3 && one == 1) list.add("C");
			else if(zero == 4 && one == 0) list.add("D");
			else if(zero == 0 && one == 4) list.add("E");
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}