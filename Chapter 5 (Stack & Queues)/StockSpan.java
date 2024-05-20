import java.io.*;
import java.util.*;

public class StockSpan {

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
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        // steps
        // 1. pop
        // 2. print answer
        // 3. push
        st.push(0);
        span[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) { // while arr[i] pops the smaller and equal elements from the stack
                st.pop();
            }
            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
}
