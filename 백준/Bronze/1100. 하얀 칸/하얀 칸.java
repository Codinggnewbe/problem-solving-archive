import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int chessboard[][] = {
        		{1, 0, 1, 0, 1, 0, 1, 0}, 
        		{0, 1, 0, 1, 0, 1, 0, 1},
        		{1, 0, 1, 0, 1, 0, 1, 0}, 
        		{0, 1, 0, 1, 0, 1, 0, 1},
        		{1, 0, 1, 0, 1, 0, 1, 0}, 
        		{0, 1, 0, 1, 0, 1, 0, 1},
        		{1, 0, 1, 0, 1, 0, 1, 0}, 
        		{0, 1, 0, 1, 0, 1, 0, 1}
        };
        
        int count = 0;
        for(int i = 0; i < 8; i++) {
    		String chess = scanner.nextLine();
        	for(int j = 0; j < 8; j++) {
        		if(chessboard[i][j] == 1 && chess.charAt(j) == 'F') {
        	        count++;
        	    }
        	}
        }
        System.out.println(count);
    }
}