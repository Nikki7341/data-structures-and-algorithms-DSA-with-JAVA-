import java.util.*;

public class anyBaseToDecimal {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int b =  sc.nextInt();
        int num = convertBaseToDecimal(n,b);
        System.out.println(num);
    }

    public static int convertBaseToDecimal(int n, int b){
        int num = 0;
        int p = 0;
        while (n > 0){
            int rem = n % 10;
            rem = rem * (int)Math.pow(b, p);
            num += rem;
            p++;
            n = n / 10;
        }

        return num;
    }
}
