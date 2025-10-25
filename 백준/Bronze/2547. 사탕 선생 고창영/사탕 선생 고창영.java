import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<BigInteger> list = new ArrayList<>();
		ArrayList<BigInteger> studentList = new ArrayList<>();
		
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			BigInteger sum = BigInteger.ZERO;
			int student = scanner.nextInt();
			BigInteger studentBig = BigInteger.valueOf(student);
			
			for(int j = 0; j < student; j++) {
				BigInteger candy = scanner.nextBigInteger();
				sum = sum.add(candy);
			}

			studentList.add(studentBig);
			list.add(sum);
		}

		for(int i = 0; i < num; i++) {
			BigInteger candySum = list.get(i);
			BigInteger students = studentList.get(i);
			if(candySum.remainder(students).equals(BigInteger.ZERO)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}