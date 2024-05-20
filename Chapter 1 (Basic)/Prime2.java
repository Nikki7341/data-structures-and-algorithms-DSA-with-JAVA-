import java.util.*;
// Print all Prime Numbers till N

public class Prime2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start ; i <=end ; i++){
            int count = 0;
            for (int div = 2 ; div * div <= i ; div++){
                if(i % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}