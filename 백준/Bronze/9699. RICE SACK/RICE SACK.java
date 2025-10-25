import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> maxList = new ArrayList<>(); 
		int nums = scanner.nextInt();

		
		for(int i = 0; i < nums; i++) {
			 ArrayList<Integer> list = new ArrayList<>();
			 
			 for(int j = 0; j < 5; j++) {
				 int a = scanner.nextInt();
				 list.add(a);
			 }
			 
			 int max = list.get(0);
			 for(int j = 1; j < list.size(); j++) {
				 if(max < list.get(j))
					 max = list.get(j);
			 }
			 maxList.add(max);
		}
		
		for(int i = 0; i < maxList.size(); i++) {
			System.out.println("Case #" + (i+1) + ": " + maxList.get(i));
		}
	}
}