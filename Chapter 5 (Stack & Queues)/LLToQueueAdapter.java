import java.io.*;
import java.util.*;

public class LLToQueueAdapter {

  public static class LinkedListToQueueAdapter {
    LinkedList<Integer> list;

    public LinkedListToQueueAdapter() {
      list = new LinkedList<>();
    }

    int size() {
      // write your code here
      return list.size();
    }

    void add(int val) {
      // write your code here
      list.addLast(val);
    }

    int remove() {
      // write your code here
      if(size() == 0){
        System.out.println("Queue is empty");
        return -1;
      }else {
          return list.removeFirst();
      }
    }

    int peek() {
      // write your code here
      return list.getFirst();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedListToQueueAdapter qu = new LinkedListToQueueAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}