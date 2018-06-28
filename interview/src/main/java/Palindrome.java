import com.sun.org.apache.xpath.internal.operations.Bool;

public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {
      System.out.println("isPalindrome: "+isPalindrome("wuk"));
    }

    public static boolean isPalindrome(String s) {
        Boolean x=true;
for(int i=0;i<s.length();i++){
    if (s.charAt(i)==s.charAt(s.length()-(i+1))){
x=true;

    }else x=false;

}

return x;

}}
