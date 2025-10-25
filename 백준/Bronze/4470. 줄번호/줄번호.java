import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			String words = scanner.nextLine();
			list.add(words);
		}
		
		for(int i = 0; i < list.size(); i++) {
			String word = list.get(i);
			System.out.println(i + 1 + ". " + word);
		}
	}
}