import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MelvinEating here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MelvinEating extends Actor
{
    GifImage melvineating = new GifImage("eatright.gif");
    
    /**
     * Act - do whatever the MelvinEating wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(melvineating.getCurrentImage());
    }
}
