import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{
    
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        MenuButton menuButton = new MenuButton();
        addObject(menuButton, 400, 525);
        InstructionImage instructions = new InstructionImage();
        addObject(instructions, 400, 250);
        MelvinEating melvineating = new MelvinEating();
        addObject(melvineating, 400, 160);
    }
}
