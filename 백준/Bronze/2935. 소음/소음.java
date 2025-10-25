import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BigInteger num1 = scanner.nextBigInteger();
        String operator = scanner.next();
        BigInteger num2 = scanner.nextBigInteger();
        
        if(operator.equals("+")) {
        	BigInteger res = num1.add(num2);
            System.out.println(res);
        }
        else if(operator.equals("*")) {
        	BigInteger res = num1.multiply(num2);
            System.out.println(res);
        }
    }
}