import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			
			if(x == 0 && y == 0) {
				list.add("AXIS");
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				break;
			}
			else {
				String res;
				if(x > 0 && y > 0) {
					res = "Q1";
					list.add(res);
				}
				else if(x < 0 && y > 0) {
					res = "Q2";
					list.add(res);
				}
				else if(x > 0 && y < 0) {
					res = "Q4";
					list.add(res);
				}
				else if(x < 0 && y < 0) {
					res = "Q3";
					list.add(res);
				}
				else {
					res = "AXIS";
					list.add(res);
				}
			}
		}
	}
}