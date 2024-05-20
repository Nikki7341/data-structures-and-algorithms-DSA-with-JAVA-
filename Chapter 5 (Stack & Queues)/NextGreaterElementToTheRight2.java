import java.io.*;
import java.util.*;


// Next Greater Element on the Right | Alternative Solution
public class NextGreaterElementToTheRight2 {

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
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(0);
        for(int i = 1; i < arr.length; i++){
            while(st.size() > 0 && arr[i] > arr[st.peek()]){
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        while(st.size() > 0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
}
