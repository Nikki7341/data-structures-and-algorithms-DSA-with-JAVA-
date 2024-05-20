import java.util.*;

public class SumOfTwoArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            arr1[i] = sc.nextInt();
        }

        int len2 = sc.nextInt();
        int[] arr2 = new int[len2];
        for (int i = 0; i < len2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] sum = new int[len1 > len2 ? len1 : len2];
        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += arr1[i];
            }

            if (j >= 0) {
                d += arr2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (c != 0) {
            System.out.println(c);
        }

        for (int val : sum) {
            System.out.println(val);
        }

    }
}
