public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {


    }

    public boolean isPalindrome(String s) {

        boolean palindrome = true;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length() -1 -i)) {
                palindrome = false;
            }
        }

        //TODO - implement method!

        return palindrome;
    }
}
