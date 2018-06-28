package fundamentals;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DogArrayTest {

    @Test
    public void testDogArraySum() {
        int[] myArray = {1, 2, 3};
        assertThat(Dog.sumArray(myArray), equalTo(6));

        //test commit
    }
}
