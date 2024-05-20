import java.util.*;

public class anyBaseAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = addTwoNums(b, num1, num2);
        System.out.println(ans);
    }

    public static int addTwoNums(int b, int num1, int num2) {
        int re = 0;
        int c = 0;
        int p = 1;
        while (num1 > 0 || num2 > 0 || c > 0) {
            int n1 = num1 % 10;
            int n2 = num2 % 10;
            int sum = n1 + n2 + c;
            c = sum / b;
            sum = sum % b;
            re += sum * p;
            p = p * 10;
            num1 = num1 / 10;
            num2 = num2 / 10;
        }
        return re;
    }
}
