public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }
    public boolean isPalindrome(String s) {
        //string for reversing word
        String n = "";
        //loop for copying word into its reverse
            for(int var = s.length() - 1; var >= 0; var--)
                {
                    n += s.charAt(var);
                }
        //returning binary value
        return (n.equals(s));
    }
}
