import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		list.add(num1);
		list.add(num2);
		list.add(num3);
		
		int max = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i))
				max = list.get(i);
		}
		list.remove(Integer.valueOf(max));
		
		int min = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(min > list.get(i))
				min = list.get(i);
		}
		list.remove(Integer.valueOf(min));
		
		int middle = list.get(0);
		
		System.out.println(min + " " + middle + " " + max);
	}
}