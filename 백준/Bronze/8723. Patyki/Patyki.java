import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a == b && b == c && c == a) {
			System.out.println("2");
		}
		else if(a > b && a > c) {
			if(a*a == b*b + c*c)
				System.out.println("1");
			else {
                System.out.println("0");
            }
		}
		else if(b > a && b > c) {
			if(b*b == a*a + c*c)
				System.out.println("1");
			else {
                System.out.println("0");
            }
		}
		else if(c > a && c > b) {
			if(c*c == a*a + b*b)
				System.out.println("1");
			else {
                System.out.println("0");
            }
		}
		else {
			System.out.println("0");
		}
	}
}