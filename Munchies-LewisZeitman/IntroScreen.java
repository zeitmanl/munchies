import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroScreen extends World
{

    /**
     * Constructor for objects of class IntroScreen.
     * 
     */
    public IntroScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        IntroGraphic screen = new IntroGraphic();
        addObject(screen, 400, 225);
        StartButton playButton = new StartButton();
        addObject(playButton, 200, 500);
        InstructionsButton instructionButton = new InstructionsButton();
        addObject(instructionButton, 400, 500);
        QuitButton quitButton = new QuitButton();
        addObject(quitButton, 600, 500);
    }
}
