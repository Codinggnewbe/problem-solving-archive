import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 5; i++) {
        	int sum = 0;
        	for(int j = 0; j < 4; j++) {
        		int num = scanner.nextInt();
        		sum += num;
        	}
        	list.add(sum);
        }
        
        int max = list.get(0);
        int maxPos = 0;
        for(int i = 1; i < list.size(); i++) {
        	if(max < list.get(i)) {
        		max = list.get(i);
        		maxPos = i;
        	}
        }      
        System.out.println(maxPos + 1 + " " + max);
    }
}