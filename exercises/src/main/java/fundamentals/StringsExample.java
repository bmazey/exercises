package fundamentals;

public class StringsExample {
}


    public static void main (String[] args) {
        String s = "brown fox";

        //System.out.println(s.length());

        for (int i = 1; i < s.length(); i++) {
            //System.out.println(s.charAt(i) + ": i value is " + i);
        }

        int k = 0;

        while (k < s.length()) {
            // System.out.println(s.charAt(k++));
            k++;
        }

        int[] myArray = {1, 18, 23, 7};
        String[] myStringArray = {"the", "quick", "brown", "fox", "1"};
        char[] myCharArray = {'t', 'h', 'e'};

        for (int j = 0; j < myArray.length; j++) {
            //System.out.println(myArray[j]);
        }

        for (String t: myStringArray) {
            System.out.print(t + " ");
        }

        //ok - below we'll demonstrate the == string behaviour

        String s1 = "ladybug";

        String s2 = "lady";
        String s3 = "bug";

        String s4 = s2 + s3;

        System.out.printIn("here's the value of s1: " + s1);
        System.out.printIn("here's the value of ")
    }
}