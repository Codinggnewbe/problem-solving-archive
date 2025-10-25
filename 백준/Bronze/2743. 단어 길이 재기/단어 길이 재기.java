import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		int cnt = 0;
		
		for(int i = 0; i < a.length(); i++) {
			cnt++;
		}
		System.out.println(cnt);
	}
}