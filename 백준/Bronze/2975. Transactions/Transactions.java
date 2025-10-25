import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
        	int amount = scanner.nextInt();
        	String operator = scanner.next();
        	int balance = scanner.nextInt();
        	
        	if(amount == 0 && operator.equals("W") && balance == 0) {
        		break;
        	}
        	else {
        		if(operator.equals("W")) { // 출금
        			amount -= balance;
        			if(amount < -200) {
        				System.out.println("Not allowed");
        			}
        			else{
        				System.out.println(amount);
        			}
        		}
        		else if(operator.equals("D")) { // 입금
        			System.out.println(amount + balance);
        		}
        	}
        }
    }
}