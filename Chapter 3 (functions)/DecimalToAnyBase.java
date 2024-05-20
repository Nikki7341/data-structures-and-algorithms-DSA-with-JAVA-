import java.util.*;

public class DecimalToAnyBase {
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int b =  sc.nextInt();
        int num = convertToAnyBase(n,b);
        System.out.println(num);
    }

    public static int convertToAnyBase(int n, int b) {
        int num = 0;
        int mul = 0;
        while (n > 0){
            int rem = n % b;
            rem = rem * (int)Math.pow(10,mul);
            mul++;
            num = num + rem;
            n = n / b;
        }
        return num;
    }
}
