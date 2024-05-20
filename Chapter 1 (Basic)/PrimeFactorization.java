import java.util.*;

public class PrimeFactorization {

    // MY APPROACH 

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n1 = sc.nextInt();

    //     int d = 2;
    //     int num = n1; // 12
    //     while(num != 1){
    //         if(num % d == 0){
    //             num = num / d; // 6 // 3
    //             System.out.println(d); // 2 3
    //         } else {
    //             d++;
    //         }
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        for(int div = 2; div * div <= n1; div ++){
            while(n1 % div == 0){
                n1 = n1 / div;
                System.out.println(div);
            }
        }

        if(n1 != 1){
            System.out.println(n1);
        }
    }

}
