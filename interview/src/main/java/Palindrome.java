public class Palindrome {

    public static void main(String [] args) {}

    public boolean isPalindrome(String s) {

        //Input string
        boolean palindrome = true;
        int checkAt = 0;

        //Define the new variable "checkAt"
        //Loop compare the following:
        // 1. Whether the checked part fits the requirement of being a palindrome
        // 2. Whether checking process reached the middle (0.5*stringLength)
        while (palindrome && checkAt < s.length()){
            palindrome = s.charAt(checkAt)==s.charAt(s.length()-1-checkAt);
            checkAt ++;
        }

        //returning boolean
        return (palindrome);

    }
}

// 06.28.18 Coding Fin ><(((º>