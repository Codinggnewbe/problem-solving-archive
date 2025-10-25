import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
			String sentence = scanner.nextLine();
			if(sentence.equals("#")) {
				for(int i = 0; i < list.size(); i++) {
					String selected = list.get(i);
					int count = 0;
					
					for(int j = 0; j < selected.length(); j++) {
						char ch = selected.charAt(j);
						if(ch != ' ' && ch != '.' && ch != '!' && ch != '?' &&
								(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
								|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
							count++;
						}
					}
					System.out.println(count);
				}
				break;
			}
			else {
				list.add(sentence);
			}
		}
	}
}