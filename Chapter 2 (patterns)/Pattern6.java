import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int st = n/2 + 1;
       int sp = 1;

       for (int i = 1 ; i <= n; i++){
        for (int t = 1; t <= st; t++) {
            System.out.print("*\t");
        }
        for (int s = 1; s <= sp; s++) {
            System.out.print("\t");
        }
        for (int s = 1; s <= st; s++) {
            System.out.print("*\t");
        }
        System.out.println();
        if(i <= n/2){
            st--;
            sp += 2;
        } else {
            st++;
            sp -= 2;
        }
       }
    }

}
