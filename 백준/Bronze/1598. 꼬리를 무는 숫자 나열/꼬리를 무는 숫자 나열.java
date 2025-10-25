import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(); 
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		// 몫의 값은 가로줄의 위치, 나머지의 값은 4행 중 어느 칸에 위치하는가
		int n1F = n1 / 4;
		int n2F = n2 / 4;
		int n1Ff = n1 % 4;
		int n2Ff = n2 % 4;
		
		if(n1 % 4 == 0)
			n1F -= 1;
		
		if(n2 % 4 == 0)
			n2F -= 1;
		
		if(n1Ff == 0)
			n1Ff = 4;
		
		if(n2Ff == 0)
			n2Ff = 4;
		
		int width = Math.abs(n1F - n2F);
		int height = Math.abs(n1Ff - n2Ff);
		 
		if((n1 == 1 || n1 == 2 || n1 == 3 || n1 == 4) && (n2 == 1 || n2 == 2 || n2 == 3 || n2 == 4))
			System.out.println(Math.abs(n1- n2));
		else {
			System.out.println(width + height);
		}

	}
}