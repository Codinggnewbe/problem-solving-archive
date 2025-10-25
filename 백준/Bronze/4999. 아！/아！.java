import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String hwan = scanner.next();
		String doctor = scanner.next();
		
		int hwanA = 0;
		int doctorA = 0;
		
		for(int i = 0; i < hwan.length(); i++) {
			char aa = hwan.charAt(i);
			if(aa == 'a') hwanA++;
		}
		
		for(int i = 0; i < doctor.length(); i++) {
			char aa = doctor.charAt(i);
			if(aa == 'a') doctorA++;
		}
		
		if(hwanA >= doctorA) System.out.println("go");
		else System.out.println("no");
	}
}