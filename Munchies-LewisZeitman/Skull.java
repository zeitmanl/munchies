import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skull extends Animal
{
    GifImage skull = new GifImage("skull.gif");
    
    /**
     * Act - do whatever the Skull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(skull.getCurrentImage());
        
        if (atWorldEdge()) {
            turn(17);
        }

        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(91) - 45);
        }
        move();
        
        if(canSee(Melvin.class))
        {
            eat(Melvin.class);
            //Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}
