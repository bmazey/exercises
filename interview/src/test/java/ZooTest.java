import org.junit.Test;
import zoo.Cat;
import zoo.Panther;
import zoo.Tiger;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ZooTest {

    /**
     * Let's start by making all of the Animals, then testing their properties.
     */

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
        assertThat(myPanther.getColor(), equalToIgnoringCase("BLACK"));
    }

    @Test
    public void testPantherCall() {
        assertThat(myPanther.getCall(), equalToIgnoringCase("Roar"));
    }

    @Test
    public void testPantherVertebrate() { assertThat(myPanther.getVertebrate(), equalToIgnoringCase("Mammal"));}

    Cat myTiger = new Tiger();

    @Test
    public void testTigerSize() { assertEquals(myTiger.getSize().intValue(), 4); }

    @Test
    public void testTigerVertebrate() { assertEquals(myTiger.getVertebrate(), "Mammal");}

    @Test
    public void testTigerLegs() { assertEquals(myTiger.getNumberOfLegs().intValue(), 4);}

    @Test
    public void testTigerColor() { assertEquals(myTiger.getColor(), "ORANGE");}

    @Test
    public void testTigerCall() { assertEquals(myTiger.getCall(), "Rauu");}
}
