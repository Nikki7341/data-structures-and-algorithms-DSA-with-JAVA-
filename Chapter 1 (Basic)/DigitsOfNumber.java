import java.util.*;

public class DigitsOfNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 5252
        int nod= 0;
        int temp = num;
        while(temp != 0){
            temp = temp / 10;
            nod++;
        }
        int div = (int)Math.pow(10, nod-1); // 1000
        while(div != 0){
            int q = num / div; // 5252 / 1000
            System.out.println(q); // 5

            num = num % div; // 252
            div = div / 10; // 100
        }
      

    }
    
}
