import java.util.Random;

public class randomIntegerGenerating {

    public static void main(String[] args){

        Random rand = new Random();

        for(int i=0; i<10; i++) {
            int randomInt = rand.nextInt(10) + 1;
            System.out.println(randomInt);
        }

    }

}