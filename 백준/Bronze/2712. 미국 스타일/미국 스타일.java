import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> valueList = new ArrayList<>();
		ArrayList<String> unitList = new ArrayList<>();
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			double value = scanner.nextDouble();
			String unit = scanner.next();
			
			if(unit.equals("kg")) { // -> lb, 1 -> 2.2046
				value = 2.2046 * value;
				String stringValue = String.format("%.4f", value);
				valueList.add(stringValue);
				unitList.add("lb");
			}
			else if(unit.equals("lb")) { // -> kg, 1 -> 0.4536
				value = 0.4536 * value;
				String stringValue = String.format("%.4f", value);
				valueList.add(stringValue);
				unitList.add("kg");
			}
			else if(unit.equals("l")) { // -> g, 1 -> 0.2642
				value = 0.2642 * value;
				String stringValue = String.format("%.4f", value);
				valueList.add(stringValue);
				unitList.add("g");
			}
			else if(unit.equals("g")) { // -> l, 1 -> 3.7854 
				value = 3.7854 * value;
				String stringValue = String.format("%.4f", value);
				valueList.add(stringValue);
				unitList.add("l");
			}
		}
		
		for(int i = 0; i < valueList.size(); i++) {
			System.out.println(valueList.get(i) + " " + unitList.get(i));
		}
	}
}