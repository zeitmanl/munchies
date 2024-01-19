import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuitButton extends Actor
{
    /**
     * Act - do whatever the QuitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public QuitButton(){
        GreenfootImage image = getImage();
        image.scale(185, 51);
        setImage(image);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            System.exit(0);
        }
    }
}
