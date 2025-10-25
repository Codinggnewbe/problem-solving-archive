import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			int num = scanner.nextInt();
			if(num == 0) {
				for(int i = 0; i < list.size(); i++) {
					int selNum = list.get(i);
					for(int j = 0; j < selNum; j++) {
						for(int n = 0; n < j + 1; n++) {
							System.out.print("*");
						}
						System.out.println();
					}
				}
				break;
			}
			else {
				list.add(num);
			}
		}
	}
}