import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++) {
        	int a = scanner.nextInt();
        	int b = scanner.nextInt();
        	a = a % 10;
        	if(a == 1) {
    			System.out.println("1");
    		}
    		else if(a == 2) {
    			int two[] = {2, 4, 8, 6};
    			int loc = b % two.length; // 0이면 마지막을, 그 외는 -1을 할 것.
    			if(loc == 0) {
    				System.out.println(two[3]);
    			}
    			else {
    				System.out.println(two[loc - 1]);
    			}
    		}
    		else if(a == 3) {
    			int three[] = {3, 9, 7, 1};
    			int loc = b % three.length;
    			if(loc == 0) {
    				System.out.println(three[3]);
    			}
    			else {
    				System.out.println(three[loc - 1]);
    			}
    		}
    		else if(a == 4) {
    			int four[] = {4, 6};
    			int loc = b % four.length;
    			if(loc == 0) {
    				System.out.println(four[1]);
    			}
    			else {
    				System.out.println(four[0]);
    			}
    		}
    		else if(a == 5) {
    			System.out.println("5");
    		}
    		else if(a == 6) {
    			System.out.println("6");
    		}
    		else if(a == 7) {
    			int seven[] = {7, 9, 3, 1};
    			int loc = b % seven.length;
    			if(loc == 0) {
    				System.out.println(seven[3]);
    			}
    			else {
    				System.out.println(seven[loc - 1]);
    			}
    		}
    		else if(a == 8) {
    			int eight[] = {8, 4, 2, 6};
    			int loc = b % eight.length;
    			if(loc == 0) {
    				System.out.println(eight[3]);
    			}
    			else {
    				System.out.println(eight[loc - 1]);
    			}
    		}
    		else if(a == 9) {
    			int nine[] = {9, 1};
    			int loc = b % nine.length;
    			if(loc == 0) {
    				System.out.println(nine[1]);
    			}
    			else {
    				System.out.println(nine[0]);
    			}
    		}
    		else if(a == 0) {
    			System.out.println("10");
    		}
        }
    }
}