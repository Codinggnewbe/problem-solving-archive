import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		
		for(int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			int ascii = (int)c;
			if(ascii <= 90) ascii += 32;
			else if(ascii >= 97) ascii -= 32;
			char cc = (char)ascii;
			System.out.print(cc);
		}
	}
}