import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // 해야할 운동 분
        int m = scanner.nextInt(); // 초기 맥박
        int M = scanner.nextInt(); // 최대 맥박
        int T = scanner.nextInt(); // 운동시 올라가는 맥박
        int R = scanner.nextInt(); // 휴식시 내려가는 맥박
        int exerciseTime = 0;
        int totalTime = 0;
        int changeM = m;
        
        while(true) {
        	if(exerciseTime == N) {
                System.out.println(totalTime);
        		break;
        	}
        	if(changeM + T <= M) { // 운동 시작
        		exerciseTime++;
        		totalTime++;
        		changeM += T;
        	}
        	else { // 휴식 시작
                totalTime++;
        		if(changeM - R < m) { // 초기 맥박보다 작아지려고 하면
            		changeM = m;
            		if(changeM + T > M) { // 최소치까지 내려간 상태에서 운동을 하려고 할 때 최대심박수를 넘으면
                		System.out.println("-1");
                		break;
            		}
        		}
        		else{
        			changeM -= R;
        		}
        	}
        } // while문 끝
    }
}