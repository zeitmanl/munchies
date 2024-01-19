import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryAgainButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryAgainButton extends Actor
{
    /**
     * Act - do whatever the TryAgainButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TryAgainButton(){
        GreenfootImage image = getImage();
        image.scale(185, 51);
        setImage(image);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level1());
        }
    }
}
