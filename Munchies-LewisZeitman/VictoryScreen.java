import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VictoryScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VictoryScreen extends World
{
    Victory victory = new Victory();
    Score scoreText = new Score();
    Counter score = new Counter();
    
    /**
     * Constructor for objects of class VictoryScreen.
     * 
     */
    public VictoryScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(victory, 400, 200);
        addObject(scoreText, 400, 350);
        String yourScore = Integer.toString(score.value);
        showText(yourScore, 400, 425);
        TryAgainButton retryButton = new TryAgainButton();
        addObject(retryButton, 300, 500);
        MenuButton menuButton = new MenuButton();
        addObject(menuButton, 500, 500);
        Greenfoot.playSound("hiScore.mp3");
    }
}
