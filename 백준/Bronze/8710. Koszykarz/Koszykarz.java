import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long ko = scanner.nextLong();
		long wantKo = scanner.nextLong();
		long bump = scanner.nextLong();
		int cnt = 0;
		
		if(bump < 0)
			return;
		
		while(true) {
			if(ko >= wantKo) {
				System.out.println(cnt);
				return;
			}
			else if(ko < wantKo) {
				ko += bump;
				cnt++;
			}
		}
	}
}