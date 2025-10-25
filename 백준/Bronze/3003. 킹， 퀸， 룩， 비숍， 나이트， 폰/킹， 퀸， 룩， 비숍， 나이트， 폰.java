import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int king = scanner.nextInt(); // 1
		
		int queen = scanner.nextInt(); // 1
		
		int look = scanner.nextInt(); // 2
		
		int vi = scanner.nextInt(); // 2
		
		int knight = scanner.nextInt(); // 2
		
		int phone = scanner.nextInt(); // 8
		
		if(king != 1) System.out.print(1 - king + " ");
		else System.out.print("0 ");
		
		if(queen != 1) System.out.print(1 - queen + " ");
		else System.out.print("0 ");
		
		if(look != 2) System.out.print(2 - look + " ");
		else System.out.print("0 ");
		
		if(vi != 2) System.out.print(2 - vi + " ");
		else System.out.print("0 ");
		
		if(knight != 2) System.out.print(2 - knight + " ");
		else System.out.print("0 ");
		
		if(phone != 8) System.out.print(8 - phone);
		else System.out.print("0 ");
	}
}