import java.io.*;
import java.util.*;

public class InfixConversation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> ops = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);
            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                pre.push(ch + "");
                post.push(ch + "");
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    process(ops, pre, post);
                }
                ops.pop(); // popping the opening (
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!ops.isEmpty() && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {
                    process(ops, pre, post);
                }
                ops.push(ch); // pushing your current operator 
            }
        }

        while (!ops.isEmpty()) {
            process(ops, pre, post);
        }

        System.out.println(pre.pop());
        System.out.println(post.pop());
    }

    public static void process(Stack<Character> ops, Stack<String> pre, Stack<String> post) {
        char op = ops.pop();

        String postv2 = post.pop();
        String postv1 = post.pop();
        String postv = postv1 + postv2 + op;
        post.push(postv);

        String prev2 = pre.pop();
        String prev1 = pre.pop();
        String prev = op + prev1 + prev2;
        pre.push(prev);
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}
