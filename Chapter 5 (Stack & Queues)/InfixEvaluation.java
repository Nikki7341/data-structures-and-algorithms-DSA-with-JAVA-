import java.util.*;
import java.io.*;

public class InfixEvaluation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // main code
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                operands.push(ch - '0');
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    char optor = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opv = operations(v1, v2, optor);
                    operands.push(opv);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operators.size() > 0 && operators.peek() != '('
                        && precedence(ch) <= precedence(operators.peek())) {
                    // ch is wanting higher priority operators to solve first
                    char optor = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opv = operations(v1, v2, optor);
                    operands.push(opv);
                }

                // ch is pushing itself now
                operators.push(ch);
            }
        }
            while (operators.size() != 0) {
                char optor = operators.pop();
                int v2 = operands.pop();
                int v1 = operands.pop();

                int opv = operations(v1, v2, optor);
                operands.push(opv);
            }
            System.out.println(operands.peek());
    }

    public static int precedence(char oprtor) {
        if (oprtor == '+') {
            return 1;
        } else if (oprtor == '-') {
            return 1;
        } else if (oprtor == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static int operations(int v1, int v2, char oprtor) {
        if (oprtor == '+') {
            return v1 + v2;
        } else if (oprtor == '-') {
            return v1 - v2;
        } else if (oprtor == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
