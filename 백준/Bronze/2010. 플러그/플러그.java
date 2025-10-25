import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int multi = scanner.nextInt();
		int total = 0;
		int plug;
		for(int i = 0; i < multi; i++) {
			if(i == multi - 1) { // 마지막은 1 감소 안함
				plug = scanner.nextInt();
				total += plug;
			}
			else { // 그 전에는 뒤의 것이 1개를 꽂아서 1 감소 필수
				plug = scanner.nextInt();
				total += (plug - 1);
			}
		}
		System.out.println(total);
	}
}