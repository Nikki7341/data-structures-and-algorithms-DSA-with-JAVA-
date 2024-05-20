import java.io.*;
import java.util.*;

public class PrefixToInfixAndPostfixEvaluation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String exp = br.readLine();

        Stack<Integer> valueStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();
        Stack<String> postfixStack = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch >= '0' && ch <= '9') {
                valueStack.push(ch - '0');
                infixStack.push(ch + "");
                postfixStack.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v1 = valueStack.pop();
                int v2 = valueStack.pop();
                int finalVal = operations(v1, v2, ch);
                valueStack.push(finalVal);

                String post1 = postfixStack.pop();
                String post2 = postfixStack.pop();
                String postStack = post1 + post2 + ch;
                postfixStack.push(postStack);

                String val1 = infixStack.pop();
                String val2 = infixStack.pop();
                String finalStack = "(" + val1 + ch + val2 + ")";
                infixStack.push(finalStack);

            }

        }

        System.out.println(valueStack.pop());
        System.out.println(infixStack.pop());
        System.out.println(postfixStack.pop());

    }

    public static int operations(int v1, int v2, char ch) {
        switch (ch) {
            case '+':
                return v1 + v2;
            case '-':
                return v1 - v2;
            case '*':
                return v1 * v2;
            case '/':
                return v1 / v2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
