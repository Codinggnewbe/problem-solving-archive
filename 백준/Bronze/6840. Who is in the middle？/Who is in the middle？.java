import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			int weight = scanner.nextInt();
			list.add(weight);
		}
		
		int max = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i))
				max = list.get(i); // 가장 큰 값 결정
		}
		list.remove(Integer.valueOf(max));
		
		int min = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(min > list.get(i))
				min = list.get(i); // 가장 작은 값 결정
		}
		list.remove(Integer.valueOf(min));
		
		int res = list.get(0); // 중간 값 출력
		System.out.println(res);
	}
}