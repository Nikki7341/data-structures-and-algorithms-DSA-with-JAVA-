import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = 0;
        int st = n;
    for (int i = 1; i <= n; i ++){
        for (int s = 1; s <= sp; s++){
            System.out.print("\t");
        }
        for (int t = 1; t <= st; t++){
            System.out.print("*\t");
        }
        System.out.println();
        sp++;
        st--;
    }
    }


    
}
