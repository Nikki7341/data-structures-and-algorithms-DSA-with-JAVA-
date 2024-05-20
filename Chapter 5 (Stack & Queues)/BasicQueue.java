import java.io.*;
import java.util.*;

public class BasicQueue {
    
    public static void main(String[] args){

        Queue<Integer> que =  new ArrayDeque<>(); // Queue 
        Stack<Integer> st = new Stack<>();

        st.push(10);
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        System.out.println(que.remove());
        System.out.println(que.peek());
    }
}
