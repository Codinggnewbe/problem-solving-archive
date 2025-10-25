import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nums = scanner.nextInt();
		
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < nums; i++) {
			String words = scanner.next();
			list.add(words);
		}
		
		for(int i = 0; i < list.size(); i++) {
			String selectedWord = list.get(i);
			char first = selectedWord.charAt(0);
			char last = selectedWord.charAt(selectedWord.length() - 1);
			System.out.print(first);
			System.out.println(last);
		}
	}
}