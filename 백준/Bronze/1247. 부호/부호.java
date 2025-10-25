import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			int line = scanner.nextInt();
			BigInteger sum = BigInteger.ZERO;
			
			for(int j = 0; j < line; j++) {
				BigInteger a = scanner.nextBigInteger();
				sum = sum.add(a);
			}
			
			if(sum.equals(BigInteger.ZERO))
				System.out.println("0");
			else if(sum.compareTo(BigInteger.ZERO) < 0)
				System.out.println("-");
			else if(sum.compareTo(BigInteger.ZERO) > 0)
				System.out.println("+");
		}
	}
}