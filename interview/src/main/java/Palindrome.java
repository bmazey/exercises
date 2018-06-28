import com.sun.org.apache.xpath.internal.operations.Bool;

public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {
      System.out.println("isPalindrome: "+isPalindrome("wuk"));
      //type every word with string class in brackets and have the result
    }

    public static boolean isPalindrome(String s) {
        Boolean x=true; // Adding new variable of boolean type
for(int i=0;i<s.length();i++){ //for loop to test equation of letters
    if (s.charAt(i)==s.charAt(s.length()-(i+1))){//conditional expression to test the equation
x=true;

    }else x=false;// if letters are not the same, x have meaning of false

}

return x;//returning x

}}
