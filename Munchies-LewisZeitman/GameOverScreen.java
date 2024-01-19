import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World
{
    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        GameOver screen = new GameOver();
        addObject(screen, 400, 225);
        TryAgainButton retryButton = new TryAgainButton();
        addObject(retryButton, 500, 500);
        MenuButton menuButton = new MenuButton();
        addObject(menuButton, 300, 500);
    }
}
