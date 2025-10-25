import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        
        int sevenX = scanner.nextInt();
        int sevenY = scanner.nextInt();
        double sevenRes = Math.round(((1000 / (double)sevenY) * (double)sevenX) * 100) / 100.0;
        list.add(sevenRes);

        int num = scanner.nextInt();
        for(int i = 0; i < num; i++) {
        	int x = scanner.nextInt();
        	int y = scanner.nextInt();
        	double res = Math.round(((1000 / (double)y) * (double)x) * 100) / 100.0;
        	list.add(res);
        }
        
        double min = list.get(0);
        for(int i = 1; i < list.size(); i++) {
        	if(min > list.get(i))
        		min = list.get(i);
        }
        
        System.out.println(min);
    }
}
