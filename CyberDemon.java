/**
 * The CyberDemon is a basic type of demon.
 * Min/Max Strength 20/40
 * Min/Max Hit Points 25/100
 * HP: 72.03
 * STR: 35.37
 * Ratio: 1.39, 2.83
 *
 * @author Mihail Vaporakis
 * @version 2021-11-4
 */
public class CyberDemon extends Demon
{
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;

    /**
     * Generates a Creature with generaric stats
     */
    public CyberDemon()
    {
        super(Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP,    
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR);
    }

    /**
     * Test methods
     */
    /**
     * @return if HP is within the valid range
     */
    public boolean checkHealthRange()
    {
        return (getHealth() > MIN_CYBERDEMON_HP && getHealth() <= MAX_CYBERDEMON_HP);
    }

    /**
     * @return if the Str is within the valid range
     */
    public boolean checkStrengthRange()
    {
        return (getStrength() > MIN_CYBERDEMON_STR && getStrength() <= MAX_CYBERDEMON_STR);
    }
    
}