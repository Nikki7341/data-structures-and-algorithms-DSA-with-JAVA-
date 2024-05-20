import java.io.*;
import java.util.*;

public class SlidingWindowMaximum {

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
        int k = 4; // window size 
        solve(a, k);
    }

    public static void solve(int[] arr, int k) {
    
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = arr.length;
            } else {
                nge[i] = st.peek();
            }

            st.push(i);
        }

        int j = 0;
        for (int i = 0; i <= arr.length - k; i++){
            // enter the loop to find maximum of window starting at i 
            if(j < i){
                j = i;
            }
            while(nge[j] < i + k){
                j = nge[j];
            }

            System.out.println(arr[j]);
        }
   

    }
}
