import java.util.*;

public class anyBaseSubtraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = subtractNumbers(b, num1, num2);
        System.out.println(ans);
    }

    public static int subtractNumbers(int b, int num1, int num2) {
        int re = 0;
        int c = 0;
        int p = 1;
        while (num2 > 0) {
            int n1 = num1 % 10;
            int n2 = num2 % 10;
            num1 = num1 / 10;
            num2 = num2 / 10;
            int d = 0;
            n2 = n2 + c;
            if (n2 >= n1) {
                c = 0;
                d = n2 - n1;
            } else {
                c = -1;
                d = n2 + b - n1;
            }
            re += d * p;
            p = p * 10;
        }
        return re;
    }
}
