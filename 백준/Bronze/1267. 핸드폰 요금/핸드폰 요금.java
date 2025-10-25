import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int nums = scanner.nextInt();
		
		for(int i = 0; i < nums; i++) {
			int a = scanner.nextInt();
			list.add(a);
		}
		
		int ySum = 0, mSum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			int n = list.get(i);
			
			ySum += (n / 30 + 1) * 10;
			mSum += (n / 60 + 1) * 15;
		}
		
		if(ySum > mSum)
			System.out.println("M " + mSum);
		else if(ySum < mSum)
			System.out.println("Y " + ySum);
		else
			System.out.println("Y M " + ySum);
	}
}