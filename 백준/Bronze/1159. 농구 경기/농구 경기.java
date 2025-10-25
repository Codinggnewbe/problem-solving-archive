import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> fiveList = new ArrayList<>();
        int num = scanner.nextInt();
        int check[] = new int[num];
        
        for(int i = 0; i < num; i++) { // check 초기화 과정
        	check[i] = 0;
        }
    	
        for(int i = 0; i < num; i++) { // 이름 입력
        	String name = scanner.next();
        	nameList.add(name);
        }
        scanner.close();
        
        for(int i = 0; i < nameList.size(); i++) { // 비교할 이름 선택
        	int nameCount = 0;
        	if(check[i] == 0) {
        		String name = nameList.get(i); // 이름 가져오기
            	char firstName = name.charAt(0);
            	nameCount++;
            	check[i] = 1;
            	
            	for(int j = i + 1; j < nameList.size(); j++) { // 선택된 이름 다음부터
            		if(check[j] == 0) {
            			String name2 = nameList.get(j);
                		char firstName2 = name2.charAt(0);
                		if(firstName == firstName2) {
                			nameCount++;
                			check[j] = 1;
                		}
            		}
            		else if(check[j] == 1) { // 이미 확인해서 카운트한 이름
            			continue;
            		}
            	}
            	if(nameCount >= 5) {
            		fiveList.add(String.valueOf(firstName));
            	}
        	}
        	else if(check[i] == 1){ // 이미 확인해서 카운트한 이름
        		continue;
        	}
        }

        if(fiveList.isEmpty()){
        	System.out.println("PREDAJA");
        }
        else {
        	Collections.sort(fiveList);
        	for(int i = 0; i < fiveList.size(); i++) {
        		System.out.print(fiveList.get(i));
        	}
        }
    }
}