import java.util.*;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int r = sc.nextInt();

        int len = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            len++;
        }

        r = r % len ; // for number
        if ( r < 0) {
            r = r + len;
        }
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= len; i++){
            if(i <= r){
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }

        int q = num / div;
        int rem = num % div;

        int rev = rem * mul + q;
        System.out.println(rev);
    }
}
