import java.util.*;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++){
            for (int j = 1; j <= n; j++){
                if(i+j == n+1){
                    System.out.print("*\t");
                } else {
                    System.out.print("n\t");
                }
            }
             System.out.println();
        }
    }

}
