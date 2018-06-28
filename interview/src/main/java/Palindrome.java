public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */
    //use n/2 so that the middle letter is not counted --> it doesn't have a matching letter

    public static void main(String [] args) {

    }

    public boolean isPalindrome(String s) {

        int n = s.length();
        for (int i = 0; i < (n/2); i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        //TODO - implement method!

        return true;
    }
}
