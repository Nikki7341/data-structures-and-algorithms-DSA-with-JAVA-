import java.io.*;
import java.util.*;

public class NextSmallerElementOnTheRight {

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the entire input line as a string
        String input = br.readLine();

        // Split the string by spaces to get individual elements
        String[] elements = input.split(" ");

        int n = elements.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            // Parse each element individually
            a[i] = Integer.parseInt(elements[i]);
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length - 1]); //push last value of arr in stack 
        nse[arr.length - 1] = -1; // mark last array next smaller element -1

        for(int i = arr.length - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] <= st.peek()){
                st.pop();
            }

            if(st.size() == 0){
                nse[i] = -1;
            } else {
                nse[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return nse;
    }
}
