import java.util.*;

public class anyBaseMultiplication {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int rv = 0;

        int p = 1;
        while (n2 > 0 ){
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int sprd = getProductWithSingleDigit(b,n1,d2);
            rv = addTwoNums(b, rv, sprd * p);
            p = p*10;
        }

        return rv;
    }

    public static int getProductWithSingleDigit(int b, int n1, int d2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d = d1 + d2 + c;

            c = d / b;
            d = d % b;
            rv = rv + d * p;
            p = p * 10;
        }

        return rv;
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
