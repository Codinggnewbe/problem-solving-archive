import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double weight = scanner.nextDouble();
		double height = scanner.nextDouble();
		
		double bmi =  weight /(height * height);
		
		if(bmi < 18.5)
			System.out.println("Underweight");
		else if(bmi >= 18.5 && bmi <= 25.0)
			System.out.println("Normal weight");
		else if(bmi > 25.0)
			System.out.println("Overweight");
	}
}