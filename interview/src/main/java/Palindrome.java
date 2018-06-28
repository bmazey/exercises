public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public boolean isPalindrome(String s) {
        //StringBuilder myStringBuilder = new StringBuilder(s);
        //String reverseString = myStringBuilder.reverse().toString();
        //if (s.equals(reverseString)) return true;
        //else return false;
        //TODO - implement method!

        boolean vani = true;
        for (int i = 0; i < s.length(); i++){
            //s.charAt(i);
            //s.charAt(s.length()-1-i);
            if(s.charAt(i)!= s.charAt(s.length()-1-i)){
                vani=false;
            }
        }

        return vani;

    }
}
