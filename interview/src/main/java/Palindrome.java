public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

   public static void main(String [] args) {

        String summer = "summer2018";

        for (int i = 0; i < summer.length(); i++) {

            System.out.println(i + " : " + summer.charAt(i));


        }

    }

    public boolean isPalindrome(String s) {


        boolean isPalindrome = true;

        for (int i = 0; i < s.length(); i++) {


            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                isPalindrome = false;
            }

        }

        return isPalindrome;
    }
}
