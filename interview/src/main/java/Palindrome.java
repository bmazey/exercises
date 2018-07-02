public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     *
     * @param args
     */

    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {

       /** String n = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            n += s.charAt(i); }
        if (n.equals(s)) return true;
        else { return false; }
        */

       return s.equals(new StringBuilder(s).reverse().toString());
    }
}
