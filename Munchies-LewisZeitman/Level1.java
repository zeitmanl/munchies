import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    Melvin melvin = new Melvin();
    LifeCounter lives = new LifeCounter();
    Counter score = new Counter();
    LevelCounter level = new LevelCounter();
    boolean isExit = false;
    boolean hasPlayed = false;
    
    /**
     * Constructor for objects of class Level1.
     * 
     */
    
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        for(int i = 1; i <= 15; i++) {
            addObject(new Hamburger(), Greenfoot.getRandomNumber(540), (20 + Greenfoot.getRandomNumber(500)));
        }
        for(int i = 1; i <= 3; i++) {
            addObject(new Skull(), Greenfoot.getRandomNumber(540), (20 + Greenfoot.getRandomNumber(500)));
        }
        melvin.lives = 5;
        
        addObject(melvin, 400, 300);
        addObject(lives, 331, 29);
        
        lives.setPrefix("Lives: ");
        addObject(score,69,29);
        score.setPrefix("Score: ");
        score.value = 0;
        score.target = 0;
        addObject(level, 200, 29);
        level.setPrefix("Level: ");
        level.setValue(1);
    }
    
    public void act() {
        nextLevel();
        lifeCounter();
        
        if (Greenfoot.getRandomNumber(100) > 98) {
            Sweets n = new Sweets();
            addObject(n, 0, Greenfoot.getRandomNumber(getHeight()));
        }
        
        if (Greenfoot.getRandomNumber(750) > 748) {
            Butter b = new Butter();
            addObject(b, 0, Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
    public void lifeCounter() {
        lives.setValue(melvin.getLives());
    }
    
    public void nextLevel() {
        if (getObjects(Hamburger.class).size() == 0) {
            Exit exit = new Exit();
            exit.level = 2;
            addObject(exit, 775, 575);
            isExit = true;
        }
        
        if (isExit == true && hasPlayed == false) {
            Greenfoot.playSound("exitSound.mp3");
            hasPlayed = true;
        }
    }
}
