import java.util.Stack;

public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal = decimal / 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}
