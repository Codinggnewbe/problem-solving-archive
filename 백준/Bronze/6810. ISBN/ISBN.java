import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long initNum = 9780921418L; // 홀수는 1, 짝수는 3을 곱함
		int first = scanner.nextInt();
		int middle = scanner.nextInt();
		int last = scanner.nextInt();
		
		int sum = 0;
		int i = 10;
		
		while(true) {
			if(i < 1)
				break;
			if(i % 2 == 0) {
				int num = (int)(initNum % 10);
				int res = num * 3;
				sum += res;
				initNum /= 10;
				i--;
			}
			else if(i % 2 == 1) {
				int num = (int)(initNum % 10);
				int res = num * 1;
				sum += res;
				initNum /= 10;
				i--;
			}
		}
		
		int firstNum = first * 1; sum += firstNum;
		int middleNum = middle * 3; sum += middleNum;
		int lastNum = last * 1; sum += lastNum;
		
		System.out.println("The 1-3-sum is " + sum);
	}
}