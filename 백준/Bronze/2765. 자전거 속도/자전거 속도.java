import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 지름, 회전수, 시간 순으로 입력
        // Trip #N: distance(총거리) MPH(평균속도)
        // 1마일 -> 5280피트 -> 63360인치
        // 1시간 -> 60분 -> 3600초
        double pi = 3.1415927;
    	int count = 0;
    	
        while(true) {
        	double diameter = scanner.nextDouble();
        	int rotations = scanner.nextInt();
        	double time = scanner.nextDouble();

        	
        	if(rotations == 0) {
        		break;
        	}
        	else {
        		count++;
        		double distanceMile = (diameter * pi * rotations) / 63360;
        		
        		double timeMPH = 0.0;
           		if(time > 0) {
           			timeMPH = distanceMile / (time / 3600);
           		}
           		
           		System.out.println("Trip #" + count + ": " + String.format("%.2f", distanceMile) + " " + String.format("%.2f", timeMPH));
        	}
        }
    }
}
