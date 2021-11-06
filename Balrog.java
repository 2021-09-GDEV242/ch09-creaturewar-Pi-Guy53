
/**
 * The Balrog is a massive fire Demon
 * Min/Max Strength 50/100
 * Min/Max Hit Points 80/200
 * HP: 164.28
 * STR: 87.87 * 2
 * Ratio: 0.61, 1.14
 *
 * @author Mihail Vaporakis
 * @version 2021-11-4
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Generates a Demon with Blarog Stats
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR);
    }
    
    /**
     * Overridden Attack method allowing the Balrog to attack twice
     * @return damage inflicted
     */
    public int attack(){
        int dmg = super.attack();
        dmg = dmg + super.attack();
        
        return dmg;
    }
}