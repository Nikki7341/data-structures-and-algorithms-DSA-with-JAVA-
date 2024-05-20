import java.io.*;
import java.util.*;

public class PostfixToInfixAndPrefixEvaluation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String exp = br.readLine();

        Stack<Integer> valueStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();
        Stack<String> prefixStack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch >= '0' && ch <= '9') {
                valueStack.push(ch-'0');
                infixStack.push(ch+"");
                prefixStack.push(ch+"");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v2 = valueStack.pop();
                int v1 = valueStack.pop();
                int val = performOperation(v1, v2, ch); // Perform the correct operation
                valueStack.push(val);

                String val2 = infixStack.pop();
                String val1 = infixStack.pop();
                String pusVal = "(" +val1 + ch + val2 + ")";
                infixStack.push(pusVal);

                String pre2 = prefixStack.pop();
                String pre1 = prefixStack.pop();
                String preVal = ch + pre1 + pre2;
                prefixStack.push(preVal);
            }
        }

        System.out.println(valueStack.pop());
        System.out.println(infixStack.pop());
        System.out.println(prefixStack.pop());
    }

    public static int performOperation(int v1, int v2, char operator) {
        switch (operator) {
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
