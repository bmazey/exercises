public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public boolean isPalindrome(String s) {

        String Tarek = "";

        for (int k = s.length()-1; k >= 0; k--) {
            Tarek += s.charAt(k);
        }

        if (s.equals(Tarek))
            return true;
        else
            return false;

    }

}
