public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     *
     * @param args
     */

    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        //A word is either a palindrome or not a palindrome, so the result will be returned as a boolean "isPalindrome"

        boolean isPalindrome = true;
        //By default, the word is considered a palindrome,

        for (int i = 0; i < s.length(); i++) {
            //This is for loop to output incremental i values until i is equal to the length of the input

            if (s.charAt(i) != s.charAt((s.length() - 1) - i)) {
                //The above takes the i values and uses them to check whether the word is NOT a palindrome. First, it compares the first
                //and last characters, the second and second-last characters, and so on.

                isPalindrome = false;
                //If any of the tested characters aren't the same, the boolean is set to false. Otherwise, it remains true.
            }
        }
        return isPalindrome;
    }   //Finally, the boolean is returned
}
