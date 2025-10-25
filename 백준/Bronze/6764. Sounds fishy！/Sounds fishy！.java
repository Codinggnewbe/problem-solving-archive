import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		
		if(num1 > num2 && num2 > num3 && num3 > num4)
			System.out.println("Fish Diving");
		else if(num1 < num2 && num2 < num3 && num3 < num4)
			System.out.println("Fish Rising");
		else if(num1 == num2 && num2 == num3 && num3 == num4)
			System.out.println("Fish At Constant Depth");
		else
			System.out.println("No Fish");
	}
}