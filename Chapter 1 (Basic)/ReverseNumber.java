import java.util.*;


public class ReverseNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 5252

        while(num != 0){
            int r = num % 10;
            num = num / 10;
            System.out.println(r);
        }

    }

    
}
