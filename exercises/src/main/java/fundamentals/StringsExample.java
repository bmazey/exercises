package fundamentals;

public class StringsExample {

    public static void main (String[] args) {

        //here's a string!
        String s = "brown fox";

        //System.out.println(s.length());

        //this is a standard for loop
        for (int i = 1; i < s.length(); i++) {
            //System.out.println(s.charAt(i) + ": i value is " + i);
        }

        //this is a while (sentinel) loop with a counter k
        int k = 0;

        while (k < s.length()) {
           // System.out.println(s.charAt(k++));
            k++;
        }

        //here are some array examples!
        int[] myArray = {1, 18, 23, 7};
        String[] myStringArray = {"the", "quick", "brown", "fox", "1"};
        char[] myCharArray = {'t', 'h', 'e'};

        for (int j = 0; j < myArray.length; j++) {
            //System.out.println(myArray[j]);
        }

        for (String t: myStringArray) {
            //System.out.print(t + " ");
        }

        //ok - below we'll demonstrate the == string behavior

        String s1 = "ladybug";

        String s2 = "lady";
        String s3 = "bug";

        String s4 = s2 + s3;

        System.out.println("here's the value of s1: " + s1);
        System.out.println("here's the value of s4: " + s4);


        if (s1.equals(s4)) {
            System.out.println("they are the same!");
        }

        else {
            System.out.println("they are different!");
        }
    }
}
