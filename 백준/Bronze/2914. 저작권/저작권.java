import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int songs = scanner.nextInt();
        int average = scanner.nextInt();
        int melody = (average - 1) * songs + 1;
        System.out.println(melody);
    }
}