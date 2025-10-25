import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hToS = scanner.nextInt(); // 집 -> 학교
		int sToP = scanner.nextInt(); // 학교 -> pc방
		int pToA = scanner.nextInt(); // pc방 -> 학원
		int aToH = scanner.nextInt(); // 학원 -> 집
		
		int totalTime = hToS + sToP + pToA + aToH;
		int x = totalTime / 60;
		int y = totalTime % 60;
		
		System.out.println(x);
		System.out.println(y);
	}
}