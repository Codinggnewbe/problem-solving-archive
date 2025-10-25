import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		int lines = scanner.nextInt();
		
		for(int i = 0; i < lines; i++) {
			String word = scanner.next();
			list.add(word);
		}
		
		for(int i = 0; i < list.size(); i++) {
			String word = list.get(i);
			String lowerWord = word.toLowerCase();
			System.out.println(lowerWord);
		}
	}
}