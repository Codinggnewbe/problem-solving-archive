import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Factorial fac = new Factorial();
		int num = scanner.nextInt();
		
		int res = fac.factorial(num);
		
		int oneRes = res % 10;
		System.out.println(oneRes);
	}
}

class Factorial {
	int factorial(int n) {
		if(n == 0)
			return 1;
		else
			return n * factorial(n-1);
	}
}