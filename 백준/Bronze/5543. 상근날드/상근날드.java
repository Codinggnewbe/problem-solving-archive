import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> bugerList = new ArrayList<>();
		ArrayList<Integer> drinkList = new ArrayList<>();
		ArrayList<Integer> priceList = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			int buger = scanner.nextInt();
			bugerList.add(buger);
		}
		
		for(int i = 0; i < 2; i++) {
			int drink = scanner.nextInt();
			drinkList.add(drink);
		}
		
		for(int i = 0; i < bugerList.size(); i++) {
			int buger = bugerList.get(i);
			for(int j = 0; j < drinkList.size(); j++) {
				int drink = drinkList.get(j);
				int price = buger + drink - 50;
				priceList.add(price);
			}
		}
		
		int min = priceList.get(0);
		for(int i = 1; i < priceList.size(); i++) {
			int minPrice = priceList.get(i);
			if(min > minPrice)
				min = minPrice;
		}
		System.out.println(min);
	}
}