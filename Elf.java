
/**
 * The Elf is an a magical creature.
 * Min/Max Strength 5/18
 * Min/Max Hit Points 8/25
 * Chance to deal x2 damage 10%
 *
 * @author Mihail Vaporakis
 * @version 2021-11-4
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Generates a Creature with stats approperiate for an Elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR);
    }
    
    /**
     * Overridden Attack method, allowing for a 10% chance to deal x2 damage
     * @return damage inflicted
     */
    public int attack(){
        int dmg = super.attack();
        int i = Randomizer.nextInt(10);
        if(i == 10)
        {
            dmg = dmg * 2;
        }
        
        return dmg;
    }
}