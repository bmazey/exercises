public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */
    public static void main(String [] args) {

    }

    public boolean isPalindrome(String s) {


        return s.equals(new StringBuilder(s).reverse().toString());

    }
}
