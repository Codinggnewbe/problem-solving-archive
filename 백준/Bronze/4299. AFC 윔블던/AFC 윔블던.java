import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = scanner.nextInt();
        int sub = scanner.nextInt();
        scanner.close();
        
        // 예외 조건 처리
        if ((sum + sub) % 2 != 0 || sum < sub) {
            System.out.println("-1");
            return;
        }
        
        int x = (sum + sub) / 2; // 큰 수
        int y = sum - x;         // 작은 수
        
        if (x < 0 || y < 0) {
            System.out.println("-1");
        } else {
            System.out.println(x + " " + y);
        }
    }
}
