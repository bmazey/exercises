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
        //true if word is identical when mirrored
        boolean mirrorWord;
        //loop for copying word into its reverse
        int var;
            for(var = s.length() - 1; var >=0; var--)
                {
                    n += s.charAt(var);
                }
        //setting bool to true-false
           mirrorWord = (n.equals(s));
        return mirrorWord;
    }
}
