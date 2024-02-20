import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

        //PART-2
        int decimalNumber = 16;
        String binaryNumber = DecimalToBinary.decimalToBinary(decimalNumber);
        System.out.println(decimalNumber +" sayısının binary formu: "+binaryNumber);

    }

    public static boolean checkForPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false;
            }
        }
        return true;
    }
}