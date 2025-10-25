import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			int man = scanner.nextInt();
			int woman = scanner.nextInt();
			
			if(man == 0 && woman == 0) {
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				break;
			}
			else {
				int sum = man + woman;
				list.add(sum);
			}
		}
	}
}