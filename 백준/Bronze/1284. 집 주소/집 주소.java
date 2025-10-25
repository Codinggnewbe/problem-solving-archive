import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
	
		while(true) {
			int num = scanner.nextInt();
			if(num == 0) { // 각 여백은 좌우로 1cm 기본, 1은 2칸, 0은 4칸, 그 외 숫자는 3칸, 여백은 숫자개수 + 1칸
				for(int i = 0; i < list.size(); i++) {
					int total = 0;
					int n = list.get(i);
					int cnt = 1;
					while(true) {
						int lastNum = n % 10;
						if(lastNum == 1)
							total += 2;
						else if(lastNum == 0)
							total += 4;
						else
							total += 3;
						
						n /= 10;
						if(n == 0) break;
						cnt++;
					}
					total += (cnt + 1);
					System.out.println(total);
				}
				break;
			}
			else {
				list.add(num);
			}
		}
	}
}