import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsButton extends Actor
{
    /**
     * Act - do whatever the InstructionsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public InstructionsButton(){
        GreenfootImage image = getImage();
        image.scale(185, 51);
        setImage(image);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Instructions());
        }
    }
}
