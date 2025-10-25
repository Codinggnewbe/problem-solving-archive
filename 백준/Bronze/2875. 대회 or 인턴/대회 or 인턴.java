import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int girl = scanner.nextInt();
        int boy = scanner.nextInt();
        int intern = scanner.nextInt();
        int team = 0;
        
    	if(girl / 2 >= boy)
    		team = boy;
    	else
    		team = girl / 2;
    	
        while(true) {
        	if(girl + boy - (team * 3) >= intern) {
        		System.out.println(team);
        		break;
        	}
        	else
        		team--;
        }
    }
}
