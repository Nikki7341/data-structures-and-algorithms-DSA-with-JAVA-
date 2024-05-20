import java.util.*;

public class SubtractionOfTwoArrays {
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

        int[] diff = new int[len2];
        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while (j >= 0) {
            int d = 0;
            int a1v = i >= 0 ? arr1[i] : 0;
            if (arr2[j] + c >= a1v) {
                d = arr2[j] + c - a1v;
                c = 0;
            } else {
                d = arr2[j] + c + 10 - a1v;
                c = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }

        int idx = 0;

        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }

    }

}
