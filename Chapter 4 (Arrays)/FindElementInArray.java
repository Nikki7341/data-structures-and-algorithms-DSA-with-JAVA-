import java.util.*;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int digit = sc.nextInt();

        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit) {
                idx = i;
                break;
            }
        }

        System.out.println(idx);
    }
}
