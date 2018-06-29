public class FizzBuzz {

    public static void main(String[] args) {
    }

    public String fizzBuzz(int numberInput) {

        // Test if the unknown input number is a multiple of 3 or 5 or 15
        boolean multipleOfThree = numberInput % 3 == 0;
        boolean multipleOfFive = numberInput % 5 == 0;
        boolean multipleOfFifteen = numberInput % 15 == 0;

        // Let the number go through the process of out put, 15 should be before 3 and 5
        //15
        if (multipleOfFifteen) {
            return ("fizzbuzz");
        }
        //3
        else if (multipleOfThree) {
            return("fizz");
        }
        //5
        else if (multipleOfFive) {
            return("buzz");
        }

        return new String();
    }
}

//06.28.18 Coding Fin ><(((º>