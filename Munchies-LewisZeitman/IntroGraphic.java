import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroGraphic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroGraphic extends Actor
{
    /**
     * Act - do whatever the IntroGraphic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public IntroGraphic() {
        GreenfootImage image = getImage();
        image.scale(600, 250);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
