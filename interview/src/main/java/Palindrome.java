public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     *
     * @param args
     */

    public static void main(String[] args) {
// something in the string
    }

    public boolean isPalindrome(String s) {
        //TODO - implement method!


        String reverse = new StringBuffer(s).reverse().toString();

        return s.equals(reverse);

    }



}


