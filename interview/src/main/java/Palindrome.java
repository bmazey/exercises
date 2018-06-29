public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {
        String s = "cac";
        int strLen = s.length();
        for (int i=0; i < s.length(); i++){
            if (s.charAt(i) == s.charAt(strLen - (1+i))); {
                System.out.println("t");
            }
        }

    }

    public boolean isPalindrome(String s) {
        //check if the first and last letter are equal
        //boolean result = false;
         return true;

        }
    }

