public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

   public static void main(String [] args) {

   }

   public boolean isPalindrome(String s) {

       String r = "";

       for (int i = s.length() - 1; i >= 0; i--) {
           r += s.charAt(i);
       }

       return r.equals(s);
   }
}
