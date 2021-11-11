

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BalrogTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BalrogTest
{
    /**
     * Default constructor for test class BalrogTest
     */
    public BalrogTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testHpRange()
    {
        Balrog balrog1 = new Balrog();
        assertEquals(true, balrog1.checkHealthRange());
    }

    @Test
    public void testStrRange()
    {
        Balrog balrog1 = new Balrog();
        assertEquals(true, balrog1.checkStrengthRange());
    }
}


