import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        String newLine = line.trim();
        
        if(newLine.isEmpty()) {
        	System.out.println("0");
        	return;
        }
        
        int count = 0;
        for(int i = 0; i < newLine.length(); i++) {
        	if(newLine.charAt(i) == ' ') count++;
        }
        System.out.println(count + 1);
    }
}