import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int speedLimit = scanner.nextInt();
		int recorded = scanner.nextInt();
		
		int gap = recorded - speedLimit;
		
		if(gap <= 0)
			System.out.println("Congratulations, you are within the speed limit!");
		else if(gap <= 20)
			System.out.println("You are speeding and your fine is $100.");
		else if(gap <= 30)
			System.out.println("You are speeding and your fine is $270.");
		else
			System.out.println("You are speeding and your fine is $500.");
	}
}