import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, String> hashVal = new HashMap<>();
        HashMap<String, Integer> hashMul = new HashMap<>();
        
        hashVal.put("black", "0"); hashVal.put("brown", "1"); hashVal.put("red", "2");
        hashVal.put("orange", "3"); hashVal.put("yellow", "4"); hashVal.put("green", "5");
        hashVal.put("blue", "6"); hashVal.put("violet", "7"); hashVal.put("grey", "8"); hashVal.put("white", "9");
        
        hashMul.put("black", 1); hashMul.put("brown", 10); hashMul.put("red", 100);
        hashMul.put("orange", 1000); hashMul.put("yellow", 10000); hashMul.put("green", 100000);
        hashMul.put("blue", 1000000); hashMul.put("violet", 10000000); hashMul.put("grey", 100000000); 
        hashMul.put("white", 1000000000);
        
        String firstColor = scanner.next();
        String middleColor = scanner.next();
        String lastColor = scanner.next();
        
        String res1 = hashVal.get(firstColor);
        String res2 = hashVal.get(middleColor);
        String res12 = res1 + res2;
        BigInteger res = new BigInteger(res12);
        BigInteger res3 = BigInteger.valueOf(hashMul.get(lastColor));
        
        System.out.println(res.multiply(res3));
    }
}