import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> eat = new ArrayList<>();
		ArrayList<Integer> need = new ArrayList<>();
		
		int line = scanner.nextInt();
		for(int i = 0; i < line; i++) {
			int e = scanner.nextInt();
			int n = scanner.nextInt();
			eat.add(e);
			need.add(n);
		}
		
		for(int i = 0; i < eat.size(); i++) {
			int e = eat.get(i);
			int n = need.get(i);
			
			if(e < n)
				System.out.println("NO BRAINS");
			else
				System.out.println("MMM BRAINS");
		}
	}
}