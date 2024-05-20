import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n-1;
        int st = 1;
    for (int i = 1; i <= n; i ++){
        for (int s = 1; s <= sp; s++){
            System.out.print("\t");
        }
        for (int t = 1; t <= st; t++){
            System.out.print("*\t");
        }
        System.out.println();
        sp--;
        st++;
    }
    }


    
}
