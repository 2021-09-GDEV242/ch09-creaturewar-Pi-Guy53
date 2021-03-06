/**
 * The Human class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [30/10]
 * HP: 23.55 
 * STR: 13.47
 * Ratio: 4.25, 7.42
 * 
 * @author Mihail Vaporakis
 * @version 2021-11-5
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_HUMAN_HP = 30;
    private static final int MIN_HUMAN_HP = 10;
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_STR = 5;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Human()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_HUMAN_HP-MIN_HUMAN_HP)+MIN_HUMAN_HP,    
            Randomizer.nextInt(MAX_HUMAN_STR-MIN_HUMAN_STR)+MIN_HUMAN_STR
        );

    }

    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

    /**
     * Test methods
     */
    /**
     * @return if HP is within the valid range
     */
    public boolean checkHealthRange()
    {
        return (getHealth() > MIN_HUMAN_HP && getHealth() <= MAX_HUMAN_HP);
    }

    /**
     * @return if the Str is within the valid range
     */
    public boolean checkStrengthRange()
    {
        return (getStrength() > MIN_HUMAN_STR && getStrength() <= MAX_HUMAN_STR);
    }
}
