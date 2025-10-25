import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        if(num1 + num2 == num3) {
        	System.out.println(num1 + "+" + num2 + "=" + num3);
        }
        else if(num1 - num2 == num3) {
        	System.out.println(num1 + "-" + num2 + "=" + num3);
        }
        else if(num1 * num2 == num3) {
        	System.out.println(num1 + "*" + num2 + "=" + num3);
        }
        else if(num1 / num2 == num3) {
        	System.out.println(num1 + "/" + num2 + "=" + num3);
        }
        else if(num1 == num2 + num3) {
        	System.out.println(num1 + "=" + num2 + "+" + num3);
        }
        else if(num1 == num2 - num3) {
        	System.out.println(num1 + "=" + num2 + "-" + num3);
        }
        else if(num1 == num2 * num3) {
        	System.out.println(num1 + "=" + num2 + "*" + num3);
        }
        else if(num1 == num2 / num3) {
        	System.out.println(num1 + "=" + num2 + "/" + num3);
        }
    }
}