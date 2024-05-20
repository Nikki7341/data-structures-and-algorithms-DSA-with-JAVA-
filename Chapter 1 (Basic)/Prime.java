import java.util.*;
//  CHECK THE INPUT NUMBER IS PRIME OR NOT 
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of numbers ");
        int num = sc.nextInt();
        int[] arr;

        for (int i = 0; i < num; i++) {
            int nums = sc.nextInt();

            int count = 0;
            for (int div = 2; div * div <= nums; div++) {
                if (nums % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

    }
}
