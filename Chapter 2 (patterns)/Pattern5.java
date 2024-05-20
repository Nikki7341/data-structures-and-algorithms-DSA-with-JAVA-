import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int t = 1; t <= sp; t++) {
                System.out.print("\t");
            }
            for (int s = 1; s <= st; s++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i <= n / 2) {
                st += 2;
                sp--;
            } else {
                st -= 2;
                sp++;
            }

        }
    }

}
