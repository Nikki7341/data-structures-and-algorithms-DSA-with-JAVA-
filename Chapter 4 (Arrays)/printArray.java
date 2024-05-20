import java.util.*;

public class printArray {
    public static void main(String [] args){
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int[] arr2 = arr;
        arr2[1] = 500;

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+"arr");
            System.out.println(arr2[i]+"arr 2");
        }
    }
}
