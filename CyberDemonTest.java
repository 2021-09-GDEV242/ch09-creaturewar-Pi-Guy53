

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CyberDemonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CyberDemonTest
{
    /**
     * Default constructor for test class CyberDemonTest
     */
    public CyberDemonTest()
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
        CyberDemon cyberDem1 = new CyberDemon();
        assertEquals(true, cyberDem1.checkHealthRange());
    }

    @Test
    public void testStrRange()
    {
        CyberDemon cyberDem1 = new CyberDemon();
        assertEquals(true, cyberDem1.checkStrengthRange());
    }
}


