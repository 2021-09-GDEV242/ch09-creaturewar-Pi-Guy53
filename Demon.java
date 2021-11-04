/**
 * The Demon is a demotic creature that has a chance to deal significant additional damage
 * Is a type of creature that is never created directly  
 *
 * @author Mihail Vaporakis
 * @version 2021-11-4
 */
public class Demon extends Creature
{
    /**
     * Generates a Creature with generaric stats
     */
    public Demon()
    {
        super();
    }
    
    /**
     * Generates a Demon with stats passed to it from its subtypes
     */
    public Demon(int hp, int str)
    {
        super(hp, str);
    }
    
    /**
     * Overridden Attack method, allowing for a 5% chance to deal +50 damage
     * @return damage inflicted
     */
    public int attack(){
        int dmg = super.attack();
        int i = Randomizer.nextInt(20);
        if(i == 20)
        {
            dmg = dmg + 50;
        }
        
        return dmg;
    }
}