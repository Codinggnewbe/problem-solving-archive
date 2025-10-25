import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int F = scanner.nextInt();
        
        int lastTwo = N % 100;
    	N -= lastTwo;
    	
        while(true) {
        	if(N % F == 0) {
        		lastTwo = N % 100;
        		if(lastTwo < 10) {
        			System.out.println("0" + lastTwo);
        			break;
        		}
        		else {
        			System.out.println(lastTwo);
        			break;
        		}
        	}
        	else {
        		N++;
        	}
        }
    }
}