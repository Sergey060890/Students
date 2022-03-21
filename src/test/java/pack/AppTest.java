package pack;

import org.junit.Assert;
import org.junit.Test;
import pack.Strategy.OneStrategy;
import pack.Strategy.ThreeStrategy;
import pack.Strategy.TwoStrategy;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest extends OneStrategy
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void educationOneStrategy() {
        Assert.assertTrue(660 == Students.BEST_FULL_TIME / 0.1 / OneStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(330 == Students.BEST_FULL_TIME / 0.2 / OneStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(220 == Students.BEST_FULL_TIME / 0.3 / OneStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(165 == Students.BEST_FULL_TIME / 0.4 / OneStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(132 == Students.BEST_FULL_TIME / 0.5 / OneStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(110 == Students.BEST_FULL_TIME / 0.6 / OneStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(82.5 == Students.BEST_FULL_TIME / 0.8 / OneStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(66 == Students.BEST_FULL_TIME / 1 / OneStrategy.NUMBER_OF_LEVELS);

        Assert.assertFalse(94.2857143 == Students.BEST_FULL_TIME / 0.7 / OneStrategy.NUMBER_OF_LEVELS);
        Assert.assertFalse(73.3333333 == Students.BEST_FULL_TIME / 0.9 / OneStrategy.NUMBER_OF_LEVELS);
    }

    @Test
    public void educationTwoStrategy() {
        Assert.assertTrue(1980 == Students.BEST_FULL_TIME * TwoStrategy.COMPLEXITY / 0.1 / TwoStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(990 == Students.BEST_FULL_TIME * TwoStrategy.COMPLEXITY / 0.2 / TwoStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(660 == Students.BEST_FULL_TIME * TwoStrategy.COMPLEXITY / 0.3 / TwoStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(495 == Students.BEST_FULL_TIME * TwoStrategy.COMPLEXITY / 0.4 / TwoStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(396 == Students.BEST_FULL_TIME * TwoStrategy.COMPLEXITY / 0.5 / TwoStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(330 == Students.BEST_FULL_TIME * TwoStrategy.COMPLEXITY / 0.6 / TwoStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(247.5 == Students.BEST_FULL_TIME * TwoStrategy.COMPLEXITY / 0.8 / TwoStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(220 == Students.BEST_FULL_TIME * TwoStrategy.COMPLEXITY / 0.9 / TwoStrategy.NUMBER_OF_LEVELS);
        Assert.assertTrue(198 == Students.BEST_FULL_TIME * TwoStrategy.COMPLEXITY / 1 / TwoStrategy.NUMBER_OF_LEVELS);

        Assert.assertFalse(282.857143 == Students.BEST_FULL_TIME * TwoStrategy.COMPLEXITY / 0.7 / TwoStrategy.NUMBER_OF_LEVELS);
    }

    @Test
    public void educationThreeStrategy() {
        Assert.assertTrue(5940 == Students.BEST_FULL_TIME * ThreeStrategy.COMPLEXITY / 0.1 );
        Assert.assertTrue(2970 == Students.BEST_FULL_TIME * ThreeStrategy.COMPLEXITY / 0.2 );
        Assert.assertTrue(1980 == Students.BEST_FULL_TIME * ThreeStrategy.COMPLEXITY / 0.3 );
        Assert.assertTrue(1485== Students.BEST_FULL_TIME * ThreeStrategy.COMPLEXITY / 0.4 );
        Assert.assertTrue(1188 == Students.BEST_FULL_TIME * ThreeStrategy.COMPLEXITY / 0.5 );
        Assert.assertTrue(990 == Students.BEST_FULL_TIME * ThreeStrategy.COMPLEXITY / 0.6 );
        Assert.assertTrue(742.5 == Students.BEST_FULL_TIME * ThreeStrategy.COMPLEXITY / 0.8 );
        Assert.assertTrue(660 == Students.BEST_FULL_TIME * ThreeStrategy.COMPLEXITY / 0.9 );
        Assert.assertTrue(594 == Students.BEST_FULL_TIME * ThreeStrategy.COMPLEXITY / 1 );

        Assert.assertFalse(848.571429 == Students.BEST_FULL_TIME * ThreeStrategy.COMPLEXITY / 0.7 );
    }
}
