import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Double> list = new ArrayList<>();
		
		while(true) {
			double n = scanner.nextDouble();
			
			if(n == -1.0) {
				for(int i = 0; i < list.size(); i++) {
					double num = list.get(i);
					String formattedNum = String.format("%.2f", num);
					double weight = num * 0.167;
					String formattedWeight = String.format("%.2f", weight);
					System.out.println("Objects weighing " + formattedNum + " on Earth will weigh " + formattedWeight + " on the moon.");
				}
				break;
			}
			else {
				list.add(n);
			}
		}
	}
}