import java.util.*;

public class anyBaseToAnyBase {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int b1 =  sc.nextInt();
        int b2 =  sc.nextInt();
        int rn = getValue(n, b1, b2);
        System.out.println(rn);
    }

    public static int getValue(int n, int b1, int b2){
        int num = convertAnyToDecimal(n,b1);
        int finalNum = convertDecimalToAny(num,b2);
        return finalNum;
    }

    public static int convertAnyToDecimal(int n, int b1){
        int num = 0;
        int p = 0;
        while (n > 0){
            int rem = n % 10;
            rem = rem * (int)Math.pow(b1, p);
            num += rem;
            p++;
            n = n / 10;
        }
        return num;
    }
    public static int convertDecimalToAny(int n, int b2){
        int num = 0;
        int p = 0;
        while (n > 0){
            int rem = n % b2;
            rem = rem * (int)Math.pow(10, p);
            num += rem;
            p++;
            n = n / b2;
        }
        return num;
    }
}
