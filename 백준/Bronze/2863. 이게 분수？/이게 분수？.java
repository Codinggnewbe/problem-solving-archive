import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        
        double first = Math.round((((double)one / three) + ((double)two / four)) * 100) / 100.0;
        double second = Math.round((((double)three / four) + ((double)one / two)) * 100) / 100.0;
        double third = Math.round((((double)four / two) + ((double)three / one)) * 100) / 100.0;
        double fourth = Math.round((((double)two / one) + ((double)four / three)) * 100) / 100.0;
        
        if(first > second && first > third && first > fourth)
        	list.add(0);
        if(second > first && second > third && second > fourth)
        	list.add(1);
        if(third > first && third > second && third > fourth)
        	list.add(2);
        if(fourth > first && fourth > second && fourth > third)
        	list.add(3);
        
        if(list.size() == 1)
        	System.out.println(list.get(0));
        else if(list.size() > 1){
        	int minNum = list.get(0);
        	for(int i = 0; i < list.size(); i++) {
        		if(minNum > list.get(i))
        			minNum = list.get(i);
        	}
        	System.out.println(minNum);
        }
    }
}
