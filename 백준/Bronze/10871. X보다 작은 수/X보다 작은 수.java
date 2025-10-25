import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int nums = scanner.nextInt();
			list.add(nums);
		}
		
		for(int i = 0; i < list.size(); i++) {
			 int selectedNum = list.get(i);
			 if(selectedNum < x)
				 System.out.print(selectedNum + " ");
		}
	}
}