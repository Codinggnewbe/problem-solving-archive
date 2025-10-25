import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int count = 0;
        int abGap = b - a;
        int bcGap = c - b;
        
        if(abGap >= bcGap) { // b의 위치가 정중앙이거나 b가 c쪽과 가까운 경우
        	while(true) {
        		if(b == a + 1 || c == a + 1) {
                	System.out.println(count);
                	break;
                }
            	if(c > b) {
            		int gap = c - b;
            		c = c - gap - 1;
            		count++;
                }
            	else if(b > c) {
            		int gap = b - c;
            		b = b - gap - 1;
            		count++;
                }
        	}
        }
        else { // b가 a쪽과 가까운 경우
            while(true) {
                if(a == c - 1 || b == c - 1) {
                	System.out.println(count);
                	break;
                }
            	if(a < b) {
                	int gap = b - a;
                	a = a + gap + 1;
                	count++;
                }
            	else if(b < a) {
                	int gap = a - b;
                	b = b + gap + 1;
                	count++;
                }
            }
        }
    }
}