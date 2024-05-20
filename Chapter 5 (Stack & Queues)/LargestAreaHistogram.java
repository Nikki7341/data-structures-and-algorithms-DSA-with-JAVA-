import java.io.*;
import java.util.*;

public class LargestAreaHistogram {

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
        int nge = solve(a);
        System.out.println(nge);
    }

    public static int solve(int[] arr) {
       
        int[] rb = new int[arr.length]; // next smaller element on the right
        Stack<Integer> st = new Stack<>();

        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                rb[i] = arr.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }


        int[] lb = new int[arr.length]; // next smaller element on the left 

        Stack<Integer> sb = new Stack<>();

        sb.push(0);
        lb[0] = -1;
        for (int i = 1; i < arr.length; i++){
            while(sb.size() > 0 && arr[i] <= arr[sb.peek()]){
                sb.pop();
            }
            if(sb.size() == 0){
                lb[i] = -1;
            } else {
                lb[i] = sb.peek();
            }
            sb.push(i);
        }

        // calculate max area 
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++){
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;

            if(area > maxArea){
                maxArea = area;
            }
        }   
        return maxArea;

    }
}
