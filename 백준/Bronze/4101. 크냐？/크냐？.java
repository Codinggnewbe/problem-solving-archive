import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> aa = new ArrayList<>();
		ArrayList<Integer> bb = new ArrayList<>();
		
		while(true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if(a != 0 && b != 0) {
				aa.add(a);
				bb.add(b);
			}
			else if(a == 0 && b == 0) {
				for(int i = 0; i < aa.size(); i++) {
					if(aa.get(i) > bb.get(i))
						System.out.println("Yes");
					else
						System.out.println("No");
				}
				break;
			}
		}
	}
}