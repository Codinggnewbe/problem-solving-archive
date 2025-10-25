import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		int lines = scanner.nextInt();
		
		for(int i = 0; i < lines; i++) {
			String words = scanner.next();
			list.add(words);
		}
		
		for(int i = 0; i <list.size(); i++) {
			String words = list.get(i);
			char ch = words.charAt(0);
			System.out.print(ch);
			
			if(words.length() > 1) {
				for(int j = 0; j < words.length() - 1; j++) {
					char ch1 = words.charAt(j);
					char ch2 = words.charAt(j+1);
					if(ch1 == ch2)
						continue;
					else
						System.out.print(ch2);
				}
			}
			System.out.println();
		}
	}
}