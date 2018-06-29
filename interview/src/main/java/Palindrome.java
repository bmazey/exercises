public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }
    public boolean isPalindrome(String s) {
        String Omar = "";

        for(int x = s.length() -1; x >=0; x-- ) {
            Omar += s.charAt(x);
        }

        System.out.println("Omar: " + Omar + " s: " + s);

        if (s.equals(Omar)) {
            return true;
        }
        else {
            return false;
        }


    }
}
