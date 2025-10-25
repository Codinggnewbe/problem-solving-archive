import java.util.*;

public class Main {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		
		String zeroMonth = String.format("%02d", month);
        String zeroDay = String.format("%02d", day);
		
		System.out.println(year + "-" + zeroMonth + "-" + zeroDay);
	}
}