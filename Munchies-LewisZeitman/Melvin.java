import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Melvin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Melvin extends Actor
{
    public static int lives = 5;
    
    private boolean invincible = false;
    private boolean hit = false;
    private boolean hitHasPlayed = false;
    private boolean eatHasPlayed = false;
    
    GreenfootImage melvin = new GreenfootImage("134.gif");
    GifImage butterMelvin = new GifImage("135.gif");
    GifImage death = new GifImage("death1.gif");
    
    private SimpleTimer timer = new SimpleTimer();
    
    public static GreenfootSound bkgMusic;
    private boolean bkgPlayed = false;
    
    public Melvin() {
        bkgMusic = new GreenfootSound("backgroundMusic.wav");
    }
    /**
     * Act - do whatever the Melvin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    public void act()
    {
        followMouse();
        checkForCollisions();
        checkLives();
        
        if (invincible) {
            setImage(butterMelvin.getCurrentImage());
        } else if (hit && !invincible) {
            setImage(death.getCurrentImage());
        } else {
            setImage(melvin);
        }
        
        if (hit && timer.millisElapsed() > 3000) {
            hit = false;
        }
        
        if (invincible && timer.millisElapsed() > 10000) {
            invincible = false;
        }
        
        if (bkgPlayed == false) {
            bkgMusic.playLoop();
            bkgPlayed = true;
        }
    }
    
    public int getLives() {
        return lives;
    }
    
    public void setLives(int n) {
        lives = n;
    }
    
    public void followMouse() {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi != null) {
            setLocation(mi.getX(), mi.getY());
        }
    }
    
    public void checkForCollisions() {
        Actor butter = getOneIntersectingObject(Butter.class);
        if (!invincible && butter != null) {
            invincible = true;
            timer.mark();
        }
        
        Actor skull = getOneIntersectingObject(Skull.class);
        if (!invincible && skull != null) {
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(-10);
            this.setLives(lives - 1);
            hit = true;
            timer.mark();
            Greenfoot.playSound("OhNo.mp3");
        }
        
        Actor sweets = getOneIntersectingObject(Sweets.class);
        if (sweets != null) {
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(40);
        }
        
        Actor food = getOneIntersectingObject(Animal.class);
        if (food != null) {
            getWorld().removeObject(food);
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(10);
            Greenfoot.playSound("Dunk.mp3");
        }
        
        Actor exit = getOneIntersectingObject(Exit.class);
        if (exit != null) {
            bkgMusic.stop();
        }
    }
    
    public void checkLives() {
        if (lives < 1) {
            Greenfoot.setWorld(new GameOverScreen());
            bkgMusic.stop();
        }
    }
}
