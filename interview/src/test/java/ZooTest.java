import org.junit.Test;
import zoo.Cat;
import zoo.Kitten;
import zoo.Panther;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ZooTest {

    /**
     * Let's start by making all of the Animals, then testing their properties.
     */

    //Test for Panther
    Cat myPanther = new Panther();

    @Test
    public void testPantherSize() {
        assertEquals(myPanther.getSize().intValue(), 5);
    }

    @Test
    public void testPantherLegs() {
        assertEquals(myPanther.getNumberOfLegs().intValue(), 4);
    }

    @Test
    public void testPantherColor() {
        assertThat(myPanther.getColor().name(), equalToIgnoringCase("BLACK"));
    }

    @Test
    public void testPantherCall() {
        assertThat(myPanther.getCall(), equalToIgnoringCase("Roar"));
    }

    //Test for Kitten
    Cat myKitten = new Kitten();

    @Test
    public void testKittenSize() {
        assertEquals(myKitten.getSize().intValue(), 2);
    }

    @Test
    public void testKittenLegs() {
        assertEquals(myKitten.getNumberOfLegs().intValue(), 4);
    }

    @Test
    public void testKittenColor() {
        assertThat(myKitten.getColor().name(), equalToIgnoringCase("ORANGE"));
    }

    @Test
    public void testKittenCall() {
        assertThat(myKitten.getCall(), equalToIgnoringCase("Miao"));
    }

}

//Added a test for Kitten
/**
 * I am starting to understand these two ways of writing tests, I guess...
 * Get an instance, named as instanceWhatever
 * @Test
 * public void testWhatever(){
 *     assertEquals(instanceWhatever.getWhatever(), limitForValue(E.g. intValue()), expectingResult);
 * }
 * or
 * public void testWhatever(){
 *     assertThat(instanceWhatever.getWhatever(), equalToIgnoringCase(expectingResult));
 * }
 */
// 06.29.18 Coding Fin ><(((º>
