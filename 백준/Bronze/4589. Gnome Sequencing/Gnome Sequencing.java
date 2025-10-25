import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		int lines = scanner.nextInt();
		
		for(int i = 0; i < lines; i++) {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			int n3 = scanner.nextInt();
			
			list1.add(n1);
			list2.add(n2);
			list3.add(n3);
		}
		
		System.out.println("Gnomes:");
		for(int i = 0; i < list1.size(); i++) {
			int n1 = list1.get(i);
			int n2 = list2.get(i);
			int n3 = list3.get(i);
			
			if(n1 <= n2 && n2 <= n3)
				System.out.println("Ordered");
			else if(n1 >= n2 && n2 >= n3)
				System.out.println("Ordered");
			else
				System.out.println("Unordered");
		}
	}
}