/*
*UC2: Print a Hardcoded Palindrome Result
*
* @author Mohith
* @version 2.0
*/
import java.util.Scanner;


public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "madam";
        boolean isPalindrome = true;
        int length = input.length();

        for(int i=0;i<length/2;i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}
