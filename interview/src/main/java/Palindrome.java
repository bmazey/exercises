public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    //public static void main(String [] args) {

    //}

    public boolean isPalindrome(String s) {

        StringBuilder myStringBuilder = new StringBuilder(s);
        String reverseString = myStringBuilder.reverse().toString();
        if (s.equals(reverseString)) return true;
        else return false;


        //TODO - implement method!


    }
     public String aTestMethod(){
        return "this is a test method";
     }
}
