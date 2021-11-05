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

    //Index counter for the armies
    private int armyOneIndex = 0;
    private int armyTwoIndex = 0;

    //The size of the individual armies
    private int armyOneSize;
    private int armyTwoSize;

    //Max and min army sizes
    private int armyOneMaxSize = 110;
    private int armyOneMinSize = 90;
    private int armyTwoMaxSize = 50;
    private int armyTwoMinSize = 30;
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

        Fight();
    }

    /**
     * Fighting method, loops until one army is defeated
     */
    public void Fight()
    {
        //main army fighting loop
        while(armyOneIndex <= armyOneSize || armyTwoIndex <= armyTwoSize)
        {
            while(armyOne.get(armyOneIndex).isAlive() && armyTwo.get(armyTwoIndex).isAlive())
            {
                armyOne.get(armyOneIndex).takeDamage(armyTwo.get(armyTwoIndex).attack());
                armyTwo.get(armyTwoIndex).takeDamage(armyOne.get(armyOneIndex).attack());
                
                
            }
        }
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