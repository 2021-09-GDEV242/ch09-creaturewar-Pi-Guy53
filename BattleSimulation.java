import java.util.ArrayList;
/**
 * This is a simulation of a battle that takes place between two massive armies
 * Humans and Elves are on one side, facing off against Humans and Demons.
 *
 * @author Mihail Vaporakis
 * @version 2021-11-5
 */
public class BattleSimulation
{
    //ArrayList of creatures to form the army
    private ArrayList<Creature> armyOne;
    private ArrayList<Creature> armyTwo;

    //The size of the individual armies
    private int armyOneSize;
    private int armyTwoSize;

    //Max and min army sizes
    private int armyOneMaxSize = 110;
    private int armyOneMinSize = 90;
    private int armyTwoMaxSize = 50;
    private int armyTwoMinSize = 30;

    private boolean fight;
    /**
     * Constructor method for BattleSimulation, inisilizes two armies of
     * random composition
     */
    public BattleSimulation()
    {
        armyOne = new ArrayList<Creature>();
        armyTwo = new ArrayList<Creature>();

        armyOneSize = Randomizer.nextInt((armyOneMaxSize - armyOneMinSize) + armyOneMinSize);
        armyTwoSize = Randomizer.nextInt((armyTwoMaxSize - armyTwoMinSize) + armyTwoMinSize);

        for(int i = 0; i < armyOneSize; i++)
        {
            armyOne.add(addToArmyOne());
        }

        for(int i = 0; i < armyTwoSize; i++)
        {
            armyTwo.add(addToArmyTwo());
        }

        fight = true;
        Fight();
    }

    /**
     * Fighting method, loops until one army is defeated
     */
    private void Fight()
    {
        //main army fighting loop
        //individual combat loop
        while(fight && armyOne.get(0).isAlive() && armyTwo.get(0).isAlive())
        {
            armyOne.get(0).takeDamage(armyTwo.get(0).attack());
            armyTwo.get(0).takeDamage(armyOne.get(0).attack());

            if(armyOne.get(0).isKnockedOut())
            {
                armyOne.remove(0);
            }

            if(armyTwo.get(0).isKnockedOut())
            {
                armyTwo.remove(0);
            }

            if(armyOne.size() <= 0)
            {
                fight = false;
                System.out.println("The Armies of good(or maybe evil) prevailed and vanquished the foul demons.");
            }

            if(armyTwo.size() <= 0)
            {
                fight = false;
                System.out.println("The Armies of evil(or maybe good) won, and crushed the foul Elves and their allies.");
            }
        }

        System.out.println("No heros were harmed in the making of this battle, or maybe some were, we haven't \ncounted everyone yet.");
    }

    /**
     * Generates a random Creature to add to armyOne
     * @return the creature to be added
     */
    private Creature addToArmyOne()
    {
        Creature warrior;

        if(Randomizer.nextInt(10) <= 6)
        {
            warrior = new Human();
        }
        else 
        {
            warrior = new Elf();
        }

        return warrior;
    }

    /**
     * Generates a random creature for armyTwo
     * @return the creature to be added
     */
    private Creature addToArmyTwo()
    {
        Creature warrior;
        int r = Randomizer.nextInt(25);

        if(r <= 18)
        {
            warrior = new Human();
        }
        else if(r <= 24)
        {
            warrior = new CyberDemon();
        }
        else
        {
            warrior = new Balrog();
        }

        return warrior;
    }

}