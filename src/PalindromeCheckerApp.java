/*
 *UC11: Object-Oriented Palindrome Service
 *
 * @author Mohith
 * @version 11.0
 */

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        String normalized = input.toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        String normalized = input.toLowerCase();
        int start = 0;
        int end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.check(input);
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "Level";
        PalindromeContext context = new PalindromeContext();

        context.setStrategy(new StackStrategy());
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + context.executeStrategy(input));
    }
}
