import java.util.scanner;

public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }
    public boolean isPalindrome(String s) {
        String s, reverse = ""; // Objects
        Scanner in = new Scanner(System.in); // user input

        System.out.println("Enter a string to check if it is a palindrome"); // asking user for a word
        s = in.nextLine(); // the word entered by the user


            for(int var = s.length() - 1; var >= 0; var--)
                {
                    reverse += s.charAt(var);
                }
        //returning binary value
        return (reverse.equals(s));
    }
}
