import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			int num = scanner.nextInt();
			
			if(num != 0) 
				list.add(num);
			else { // 여기부터 계산 작업
				for(int i = 0; i < list.size(); i++) {
					int n = list.get(i);
					Cal cal = new Cal(n);
					int res = cal.calculate(n);
					System.out.println(res);
				}
				break;
			}
		}
	}
}

class Cal {
	int n;
	
	public Cal(int n) {
		this.n = n;
	}
	
	public int calculate(int n) {
		if(n == 1) return 1;
		else return n + calculate(n-1);
	}
}