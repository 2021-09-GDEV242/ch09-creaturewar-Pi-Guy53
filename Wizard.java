/**
 * The Wizard class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [22/8]
 * Implements a maximum/minimum hitpoint total for the creature type [20/10]
 * HP: 17.86 
 * STR: 17.78
 * Ratio: 5.60, 5.62
 * 
 * @author Mihail Vaporakis
 * @version 2021-11-5
 */
public class Wizard extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_WIZARD_HP = 20;
    private static final int MIN_WIZARD_HP = 10;
    private static final int MAX_WIZARD_STR = 22;
    private static final int MIN_WIZARD_STR = 8;

    /**
     * Constructor for objects of class Wizard -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Wizard object with values in the appropriate range
     * 
     */
    public Wizard()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_WIZARD_HP-MIN_WIZARD_HP)+MIN_WIZARD_HP,    
            Randomizer.nextInt(MAX_WIZARD_STR-MIN_WIZARD_STR)+MIN_WIZARD_STR
        );

    }
    
    /**
     * Overridden Attack method, allowing for a 25% chance to deal x2 damage
     * @return damage inflicted
     */
    public int attack(){
        int dmg = super.attack();
        int i = Randomizer.nextInt(4);
        if(i == 4)
        {
            dmg = dmg * 2;
        }
        
        return dmg;
    }

    /**
     * Test methods
     */
    /**
     * @return if HP is within the valid range
     */
    public boolean checkHealthRange()
    {
        return (getHealth() > MIN_WIZARD_HP && getHealth() <= MAX_WIZARD_HP);
    }

    /**
     * @return if the Str is within the valid range
     */
    public boolean checkStrengthRange()
    {
        return (getStrength() > MIN_WIZARD_STR && getStrength() <= MAX_WIZARD_STR);
    }
}
