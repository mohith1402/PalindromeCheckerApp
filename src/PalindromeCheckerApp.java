/*
*UC3: Palindrome Check Using String Reverse
*
* @author Mohith
* @version 3.0
 */
import java.util.Scanner;


public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = "madam";
        boolean isPalindrome = true;
        int n = word.length()-1;
        int start = 0;

        for(int i = n; i > 0; i--){
            if(word.charAt(i) != word.charAt(start)){
                isPalindrome = false;
                break;
            }
            start++;
        }

        if(isPalindrome){
            System.out.println(word+" is palindrome");
        } else  {
            System.out.println(word+" is not a palindorme");
        }
    }
}
