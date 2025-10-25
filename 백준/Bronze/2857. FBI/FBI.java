import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        for(int i = 0; i < 5; i++) {
        	String name = scanner.nextLine();
        	if(name.contains("FBI")) {
        		System.out.print(i + 1 + " ");
        		count++;
        	}
        }
        if(count == 0) {
        	System.out.println("HE GOT AWAY!");
        }
    }
}
