import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> ages = new ArrayList<>();
		ArrayList<Integer> weights = new ArrayList<>();
		
		while(true) {
			String name = scanner.next();
			int age = scanner.nextInt();
			int weight = scanner.nextInt();
			
			if(name.equals("#") && age == 0 && weight == 0) {
				for(int i = 0; i < names.size(); i++) {
					String selectedName = names.get(i);
					int selectedAge = ages.get(i);
					int selectedWeight = weights.get(i);
					
					if(selectedAge > 17 || selectedWeight >= 80) {
						System.out.println(selectedName + " Senior");
					}
					else {
						System.out.println(selectedName + " Junior");
					}
				}
				break;
			}
			else {
				names.add(name);
				ages.add(age);
				weights.add(weight);	
			}
		}
	}
}