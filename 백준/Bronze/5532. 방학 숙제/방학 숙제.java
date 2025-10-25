import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int vacation = scanner.nextInt(); // 방학 기간
		int korean = scanner.nextInt(); // 국어 문제 수
		int math = scanner.nextInt(); // 수학 문제 수
		int canSolveK = scanner.nextInt(); // 하루에 풀 수 있는 국어 문제 수
		int canSolveM = scanner.nextInt(); // 하루에 풀 수 있는 수학 문제 수
		
		double dayK = (double) korean / canSolveK; // 문제 푸는데 걸리는 일 수
		double dayM = (double) math / canSolveM;
		
		if(dayK % 1 != 0) {
			dayK = Math.ceil(dayK);
		}
		
		if(dayM % 1 != 0) {
			dayM = Math.ceil(dayM);
		}
		
		int solvedDay = 0;
		if(dayK >= dayM)
			solvedDay = (int)dayK;
		else if(dayM > dayK)
			solvedDay = (int)dayM;
		
		int playVacation = vacation - solvedDay;
		System.out.println(playVacation);
	}
}