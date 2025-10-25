import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger money = scanner.nextBigInteger();
		BigInteger people = scanner.nextBigInteger();
		scanner.close();
        
		BigInteger eachMoney = money.divide(people);
		BigInteger etcMoney = money.remainder(people);
		
		System.out.println(eachMoney);
		System.out.println(etcMoney);
	}
}