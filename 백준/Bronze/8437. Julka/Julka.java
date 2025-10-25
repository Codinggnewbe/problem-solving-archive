import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BigInteger totalApple = scanner.nextBigInteger();
		BigInteger gap = scanner.nextBigInteger();
		scanner.close();
		
		if (gap.compareTo(totalApple) >= 0) {
            System.out.println("Gap is bigger than totalApple");
            return;
        }
		
		if(totalApple.remainder(BigInteger.TWO).equals(BigInteger.ONE) && gap.remainder(BigInteger.TWO).equals(BigInteger.ONE)) {
			BigInteger klaudia = totalApple.divide(BigInteger.TWO).add(gap.divide(BigInteger.TWO).add(BigInteger.ONE));
			BigInteger natalia = totalApple.divide(BigInteger.TWO).subtract(gap.divide(BigInteger.TWO));
			System.out.println(klaudia);
			System.out.println(natalia);
		}
		else if(totalApple.remainder(BigInteger.TWO).equals(BigInteger.ZERO) && gap.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
			BigInteger klaudia = totalApple.divide(BigInteger.TWO).add(gap.divide(BigInteger.TWO));
			BigInteger natalia = totalApple.divide(BigInteger.TWO).subtract(gap.divide(BigInteger.TWO));
			System.out.println(klaudia);
			System.out.println(natalia);
		}
	}
}