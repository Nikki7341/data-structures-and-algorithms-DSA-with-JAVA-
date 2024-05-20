import java.util.*;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        boolean flag;
        if (max == a) {
            flag = ((a * a) == (b * b) + (c * c));
        } else if (max == b) {
            flag = ((b * b) == (a * a) + (c * c));
        } else {
            flag = ((c * c) == (a * a) + (b * b));
        }
        System.out.println(flag);
    }
}
