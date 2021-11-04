
/**
 * The CyberDemon is a basic type of demon.
 * Min/Max Strength 20/40
 * Min/Max Hit Points 25/100
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

}