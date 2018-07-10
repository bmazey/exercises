package patterns;

import org.junit.Test;
import patterns.strategy.SimpleStrategy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class StrategyTest {
    SimpleStrategy strategy = new SimpleStrategy();

    @Test
    public void getFirstString(){
        assertThat(strategy.workString("Marina","anything"), equalTo("Let's go!"));

    }
}
