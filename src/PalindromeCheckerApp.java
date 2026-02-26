/*
*UC4: Character Array Based Palindrome Check
*
* @author Mohith
* @version 4.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length-1;
        boolean isPalindrome = true;
        while(start<end){
            if(chars[start] != chars[end]){
                isPalindrome = false;
            }
            start++;
            end--;
        }

        if(isPalindrome){
            System.out.println(input+" is palindrome");
        } else  {
            System.out.println(input+" is not a palindorme");
        }
    }
}
