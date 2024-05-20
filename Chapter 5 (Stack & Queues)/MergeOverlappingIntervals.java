import java.io.*;
import java.util.*;


public class MergeOverlappingIntervals {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            String line = br.readLine();
            arr[i][0] = Integer.parseInt(line.split(" ")[0]);
            arr[i][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr){
        // merge overlapping intervals and print in increasing order of start 
        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++){
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < pairs.length; i++){
            if(i == 0){
                st.push(pairs[i]);
            } else {
                Pair top = st.peek();

                if(pairs[i].st > top.et){
                    st.push(pairs[i]);
                } else {
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }

        Stack<Pair> rs = new Stack<>();
        while(st.size() > 0){
            rs.push(st.pop());
        }

        while(rs.size() > 0){
            Pair p = rs.pop();
            System.out.println(p.st+" "+p.et);
        }
    }

    public static class Pair implements Comparable<Pair> {
        int st;
        int et;

        Pair(int st, int et){
            this.st = st;
            this.et = et;
        }

        // this > other return +ve
        // this = other return 0
        // this < other return -ve

        public int compareTo(Pair other){
            if(this.st != other.st){
                return this.st - other.st;
            } else {
                return this.et - other.et;
            }
        }
    }
}
