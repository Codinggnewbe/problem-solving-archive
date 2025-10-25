import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> quarterList = new ArrayList<>();
		ArrayList<Integer> dimeList = new ArrayList<>();
		ArrayList<Integer> nickelList = new ArrayList<>();
		ArrayList<Integer> pennyList = new ArrayList<>();
		
		int num = scanner.nextInt();

		for(int i = 0; i < num; i++) {
			int n = scanner.nextInt();
			
			int quarter = n / 25;
			n = n - quarter * 25;
			quarterList.add(quarter);
			
			int dime = n / 10;
			n = n - dime * 10;
			dimeList.add(dime);

			int nickel = n / 5;
			n = n - nickel * 5;
			nickelList.add(nickel);

			pennyList.add(n); //여기까지 오면 5보다 작은 수이기 때문에 다른 작업할 필요 없음
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(quarterList.get(i) + " " + dimeList.get(i) + " "
		+ nickelList.get(i) + " " + pennyList.get(i));
		}
	}
}